import numpy as np
import scipy as sp
import scipy.optimize
import matplotlib.pyplot as plt

def newton_method(func, grad, x0, tol=1e-6, max_iter=100):
    '''
    Approximate solution of f(x)=0 by Newton-Raphson's method.
    Parameters
    ----------
    func : function 
        Function value for which we are searching for a solution f(x)=0,
    grad: function
        Gradient value of function f(x)
    x0 : number
        Initial guess for a solution f(x)=0.
    tol : number
        Stopping criteria is abs(f(x)) < tol.
    max_iter : integer
        Maximum number of iterations of Newton's method.

    Returns
    -------
    xn : root

    Example
    --------
    >>> fun = lambda x: x**2 - x - 1
    >>> grad = lambda x: 2*x - 1
    >>> root = newton_method(fun, grad, 1, max_iter=20)
    '''

    iter_count = 1
    while iter_count <= max_iter:
        if abs(grad(x0)) <= tol:
            print("Mathematical error! The found root may not be correct.")
            return x0
        x1 = x0 - func(x0) / grad(x0)
        x0 = x1
        if abs(func(x0)) < tol:
            return x0

        iter_count += 1

    print("Warning! Exceeded the maximum number of iterations.")
    return x0

def plot_function(func, a, b, title):
    """
    Plot the graph of the input func within the given range [a, b].
    """
    x = np.linspace(a, b, 1000)
    y = [func(xi) for xi in x]
    plt.plot(x, y)
    plt.axhline(0, color='black', linewidth=0.5)
    plt.title(title)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.grid(True)
    plt.show()

if __name__ == "__main__":

    func1 = lambda x: x**2 - x - 1
    grad1 = lambda x: 2*x - 1

    func2 = lambda x: x**3 - x**2 - 2*x + 1
    grad2 = lambda x: 3*x**2 - 2*x - 2

    # Define the x-axis (only for plotting)
    a1, b1 = -10, 10
    a2, b2 = -10, 10

    plot_function(func1, a1, b1, "Function 1: x^2 - x - 1")
    plot_function(func2, a2, b2, "Function 2: x^3 - x^2 - 2x + 1")

    # Initial guesses (func1)
    x0_1a = -1  
    x0_1b = 2   

    # Initial guesses (func2) 
    x0_2a = -2  
    x0_2b = 0   
    x0_2c = 2   

    our_root_1a = newton_method(func1, grad1, x0_1a)
    our_root_1b = newton_method(func1, grad1, x0_1b)

    our_root_2a = newton_method(func2, grad2, x0_2a)
    our_root_2b = newton_method(func2, grad2, x0_2b)
    our_root_2c = newton_method(func2, grad2, x0_2c)

    sp_result_1a = sp.optimize.root(func1, x0_1a)
    sp_result_1b = sp.optimize.root(func1, x0_1b)
    sp_root_1a = sp_result_1a.x.item()
    sp_root_1b = sp_result_1b.x.item()

    sp_result_2a = sp.optimize.root(func2, x0_2a)
    sp_result_2b = sp.optimize.root(func2, x0_2b)
    sp_result_2c = sp.optimize.root(func2, x0_2c)
    sp_root_2a = sp_result_2a.x.item()
    sp_root_2b = sp_result_2b.x.item()
    sp_root_2c = sp_result_2c.x.item()

    print("1st root (guess -1) found by Newton's Method = {:0.8f}.".format(our_root_1a))
    print("2nd root (guess 2) found by Newton's Method = {:0.8f}.".format(our_root_1b))

    print("1st root (guess -2) found by Newton's Method = {:0.8f}.".format(our_root_2a))
    print("2nd root (guess 0) found by Newton's Method = {:0.8f}.".format(our_root_2b))
    print("3rd root (guess 2) found by Newton's Method = {:0.8f}.".format(our_root_2c))

    print("1st root (guess -1) found by SciPy = {:0.8f}".format(sp_root_1a))
    print("2nd root (guess 2) found by SciPy = {:0.8f}".format(sp_root_1b))

    print("1st root (guess -2) found by SciPy = {:0.8f}".format(sp_root_2a))
    print("2nd root (guess 0) found by SciPy = {:0.8f}".format(sp_root_2b))
    print("3rd root (guess 2) found by SciPy = {:0.8f}".format(sp_root_2c))

