import math
import numpy as np
import scipy as sp
import matplotlib.pyplot as plt

def plot_function(func, a, b,title):
    """
    This function plots the graph of the input func
    within the given interval [a,b).
    """
    x = np.linspace(a, b, 1000)
    y = func(x)
    plt.plot(x, y, label='Function')
    plt.axhline(0, color='black', linewidth=0.5)
    plt.title(title)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.legend()
    plt.grid(True)
    plt.show()


def bisection_method(func, a, b, tol=1e-6, max_iter=100):
    """
    Bisection method to find the root of a function within a given interval.

    Parameters:
    - func: The function for which the root is to be found.
    - a, b: Interval [a, b] within which the root is searched for.
    - tol: Tolerance level for checking convergence of the method.
    - max_iter: Maximum number of iterations.

    Returns:
    - root: Approximation of the root.
    """

    if func(a) * func(b) >= 0:
        raise ValueError("The function must have different signs at the endpoints a and b.")

    iter_count = 1
    while iter_count <= max_iter:
        c = (a + b) / 2
        if abs(func(c)) < tol or abs(b - a) < tol:
            return c
        iter_count += 1
        if func(c) * func(b) > 0:
            b = c
        else:
            a = c

    print("Warning! Exceeded the maximum number of iterations.")
    return (a + b) / 2

if __name__ == "__main__":
    # Define the functions
    func1 = lambda x: x**2 - x - 1  
    func2 = lambda x: x**3 - x**2 - 2*x + 1  

    a_1a, b_1a = 1,2  
    a_1b, b_1b = -2, 0  

    a_2a, b_2a = -3, -1  
    a_2b, b_2b = -0.5, 1  
    a_2c, b_2c = 1, 3  

    plot_function(func1, a_1a, b_1b, "f(x) = x^2 - x - 1")
    plot_function(func2, a_2a, b_2c, "f(x) = x^3 - x^2 - 2x + 1")

    # func1
    our_root_1a = bisection_method(func1, a_1a, b_1a)
    our_root_1b = bisection_method(func1, a_1b, b_1b)

    # func2
    our_root_2a = bisection_method(func2, a_2a, b_2a)
    our_root_2b = bisection_method(func2, a_2b, b_2b)
    our_root_2c = bisection_method(func2, a_2c, b_2c)

    #func 1
    sp_result_1a = sp.optimize.root(func1, (a_1a + b_1a) / 2)
    sp_result_1b = sp.optimize.root(func1, (a_1b + b_1b) / 2)
    sp_root_1a = sp_result_1a.x.item()
    sp_root_1b = sp_result_1b.x.item()

    # func 2
    sp_result_2a = sp.optimize.root(func2, (a_2a + b_2a) / 2)
    sp_result_2b = sp.optimize.root(func2, (a_2b + b_2b) / 2)
    sp_result_2c = sp.optimize.root(func2, (a_2c + b_2c) / 2)
    sp_root_2a = sp_result_2a.x.item()
    sp_root_2b = sp_result_2b.x.item()
    sp_root_2c = sp_result_2c.x.item()

    # Print the results
    print("1st root [1,2] Bisection Method = {:0.8f}.".format(our_root_1a))
    print("2nd root [-2, 0] Bisection Method = {:0.8f}.".format(our_root_1b))
    print("1st root [-3, -1] Bisection Method = {:0.8f}.".format(our_root_2a))
    print("2nd root [-0.5, 1] Bisection Method = {:0.8f}.".format(our_root_2b))
    print("3rd root [1, 3] Bisection Method = {:0.8f}.".format(our_root_2c))

    print("1st root [0, 1] SciPy = {:0.8f}".format(sp_root_1a))
    print("2nd root [1, 2] SciPy = {:0.8f}".format(sp_root_1b))
    print("1st root [-3, -1] SciPy = {:0.8f}".format(sp_root_2a))
    print("2nd root [-0.5, 1] SciPy = {:0.8f}".format(sp_root_2b))
    print("3rd root [1, 3] SciPy = {:0.8f}".format(sp_root_2c))


