package fr.maif.demo.part7.sealed;

public sealed class Quadrilatere implements FormeGeometrique permits Carre, Rectangle{
}
