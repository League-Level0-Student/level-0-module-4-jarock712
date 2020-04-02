void setup() {
  size(500, 500);
PImage face = loadImage("download.jpg");
  face.resize(500, 500);
  background(face);
}

void draw() {
ellipse(300, 190, 40, 70);
}
void pupil(){
  fill(0,0,0);
  ellipse(300, 190, 20, 40);
}
