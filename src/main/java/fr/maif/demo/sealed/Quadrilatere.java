package fr.maif.demo.sealed;

public sealed class Quadrilatere implements FormeGeometrique permits Carre, Rectangle{
}
