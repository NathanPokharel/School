import numpy as np
import matplotlib.pyplot as plt

def plot_function(func, a, b, title):
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

def trapezoidal_approx(func, a, b, N):
    '''Compute the Trapezoidal Approximation of Definite Integral of a function over the interval [a,b].

    Parameters
    ----------
    func : function
           Vectorized function of one variable
    a , b : numbers
        Endpoints of the interval [a,b]
    N : integer
        Number of subintervals of equal length in the partition of [a,b]

    Returns
    -------
    float
        Approximation of the definite integral by Trapezoidal Approximation.
    '''
    dx = (b - a) / N  
    x = np.linspace(a, b, N+1)  
    return 0.5 * dx * np.sum(func(x[:-1]) + func(x[1:]))  

if __name__ == "__main__":

    func_1 = lambda x: x / (x**2 + 1)
    antiderivative_1 = lambda x: 0.5 * np.log(x**2 + 1)  
    a1, b1 = 0, 5  

    func_2 = lambda x: np.exp(x)
    antiderivative_2 = lambda x: np.exp(x)  
    a2, b2 = 0, 5  

    plot_function(func_1, a1, b1, "Function 1: x / (x^2 + 1)")
    plot_function(func_2, a2, b2, "Function 2: exp(x)")

    # partitions 1st Function
    N1 = 10  

    # partitions 2nd Function
    N2 = 500  

    # Call trapezoidal_approx 
    trapezoidal_approx_1 = trapezoidal_approx(func_1, a1, b1, N1)
    trapezoidal_approx_2 = trapezoidal_approx(func_2, a2, b2, N2)

    definite_integral_1 = antiderivative_1(b1) - antiderivative_1(a1)  
    definite_integral_2 = antiderivative_2(b2) - antiderivative_2(a2)  

    error_1 = np.abs(trapezoidal_approx_1 - definite_integral_1)  
    error_2 = np.abs(trapezoidal_approx_2 - definite_integral_2)  

    print("width 1st Function = {:0.6f}".format((b1 - a1) / N1))
    print("Trapezoidal Approximation 1st Function = {:0.6f}".format(trapezoidal_approx_1))
    print("Actual Value 1st Function = {:0.6f}".format(definite_integral_1))
    print("Absolute error = {:0.8f}".format(error_1))

    print("width for 2nd Function = {:0.6f}".format((b2 - a2) / N2))
    print("Trapezoidal Approximation 2nd Function = {:0.6f}".format(trapezoidal_approx_2))
    print("Actual Value 2nd Function = {:0.6f}".format(definite_integral_2))
    print("Absolute error = {:0.8f}".format(error_2))

