# python
from unittest import TestCase
from main import checkLista
from main import cuenta_caracteres
from main import obtener_secreto
from main import get_cuota
from main import sumar

class Test(TestCase):
    def test_check_lista(self):
        self.assertFalse(checkLista([1, 3, 5]))
        self.assertTrue(checkLista([1, 4, 5]))
        self.assertFalse(checkLista([1.0, 2.0, "2"]))
        self.assertFalse(checkLista([]))
        self.assertTrue(checkLista([0]))


    def test_cuenta_caracteres_valores(self):
        self.assertEqual(cuenta_caracteres("hola"), 4)
        self.assertEqual(cuenta_caracteres(""), 0)
        self.assertEqual(cuenta_caracteres("áéíóúñ"), 6)
        self.assertEqual(cuenta_caracteres("👋🌍"), 2)

    def test_cuenta_caracteres_type_error(self):
        with self.assertRaises(TypeError):
            cuenta_caracteres(123)
        with self.assertRaises(TypeError):
            cuenta_caracteres(None)
        with self.assertRaises(TypeError):
            cuenta_caracteres(['a', 'b'])


    def test_obtener_secreto_valor(self):
        self.assertEqual(obtener_secreto({'secreto': 'valor'}), 'valor')
        self.assertEqual(obtener_secreto({'secreto': 123}), 123)
        self.assertIsNone(obtener_secreto({'secreto': None}))

    def test_obtener_secreto_key_error(self):
        with self.assertRaises(KeyError):
            obtener_secreto({})
        with self.assertRaises(KeyError):
            obtener_secreto({'no_es_secreto': 'x'})

    def test_obtener_secreto_type_error(self):
        with self.assertRaises(TypeError):
            obtener_secreto(None)
        with self.assertRaises(TypeError):
            obtener_secreto(123)
        with self.assertRaises(TypeError):
            obtener_secreto(['secreto', 'valor'])

    def test_descuentos_y_limites(self):
        # sin descuento
        self.assertAlmostEqual(get_cuota(100, 0), 100.0)
        self.assertAlmostEqual(get_cuota(100, 3), 100.0)   # 3 no aplica >3
        # >3 => 5%
        self.assertAlmostEqual(get_cuota(100, 4), 95.0)
        self.assertAlmostEqual(get_cuota(100, 5), 95.0)    # 5 aplica 5% (no >5)
        # >5 => 10%
        self.assertAlmostEqual(get_cuota(100, 6), 90.0)
        # >10 => 20%
        self.assertAlmostEqual(get_cuota(100, 11), 80.0)
        # floats en cuota y años
        self.assertAlmostEqual(get_cuota(99.99, 6), 99.99 * 0.90, places=6)
        self.assertAlmostEqual(get_cuota(200, 5.5), 200 * 0.90)

    def test_valores_extremos(self):
        self.assertAlmostEqual(get_cuota(0, 50), 0.0)
        self.assertAlmostEqual(get_cuota(1, 10), 1 * 0.90)  # 10 no >10 -> 20% only for >10, so for 10 it's 10%?
        # Nota: según la implementación actual, 10 no es >10, por tanto aplica >5 -> 10%
        self.assertAlmostEqual(get_cuota(1, 10), 1 * 0.90)

    def test_type_error(self):
        with self.assertRaises(TypeError):
            get_cuota("100", 2)
        with self.assertRaises(TypeError):
            get_cuota(100, "2")
        with self.assertRaises(TypeError):
            get_cuota([100], 2)

    def test_value_error(self):
        with self.assertRaises(ValueError):
            get_cuota(-10, 1)
        with self.assertRaises(ValueError):
            get_cuota(10, -1)

    def test_enteros_y_negativos(self):
        self.assertEqual(sumar(2, 3), 5)
        self.assertEqual(sumar(-1, 1), 0)
        self.assertEqual(sumar(0, 0), 0)

    def test_floats_y_mixtos(self):
        self.assertAlmostEqual(sumar(1.5, 2.25), 3.75)
        self.assertAlmostEqual(sumar(1, 2.5), 3.5)
        self.assertAlmostEqual(sumar(-0.5, 0.25), -0.25)

    def test_type_error_para_valores_incompatibles(self):
        with self.assertRaises(TypeError):
            sumar(1, "2")
        with self.assertRaises(TypeError):
            sumar("a", 2)
