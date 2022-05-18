package fr.maif.demo.part7.sealed;

public sealed abstract class Quadrilatere implements FormeGeometrique permits Carre, Rectangle{
}
