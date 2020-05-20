"""
Moduł służący do śledzenia postępów sieci neuronowej zaimplementowanej w module network.py
"""

import mnist_loader as mnist_loader
import network as network

training_data, validation_data, test_data = mnist_loader.load_data_wrapper()
net = network.Network([784, 90, 10])
net.SGD(training_data=training_data, epochs=5, mini_batch_size=20, eta=5.0, test_data=test_data)
