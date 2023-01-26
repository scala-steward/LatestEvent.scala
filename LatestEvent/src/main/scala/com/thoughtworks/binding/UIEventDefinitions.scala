// Don't edit this file, because it is generated by `sbt generateUIEventDefinitions`
// format: off
package com.thoughtworks.binding
import ScalaJsDomMissingTypes._
private[binding] trait UIEventDefinitions {
  import org.scalajs.dom._
  import org.scalajs.dom.raw._
  def load(eventTarget: Window) = new LatestEvent[Event](eventTarget, "load")
  def load(eventTarget: Document) = new LatestEvent[Event](eventTarget, "load")
  def load(eventTarget: Element) = new LatestEvent[Event](eventTarget, "load")
  def unload(eventTarget: Window) = new LatestEvent[Event](eventTarget, "unload")
  def unload(eventTarget: Document) = new LatestEvent[Event](eventTarget, "unload")
  def unload(eventTarget: Element) = new LatestEvent[Event](eventTarget, "unload")
  def abort(eventTarget: Window) = new LatestEvent[Event](eventTarget, "abort")
  def abort(eventTarget: Element) = new LatestEvent[Event](eventTarget, "abort")
  def error(eventTarget: Window) = new LatestEvent[Event](eventTarget, "error")
  def error(eventTarget: Element) = new LatestEvent[Event](eventTarget, "error")
  def select(eventTarget: Element) = new LatestEvent[Event](eventTarget, "select")
  def blur(eventTarget: Window) = new LatestEvent[FocusEvent](eventTarget, "blur")
  def blur(eventTarget: Element) = new LatestEvent[FocusEvent](eventTarget, "blur")
  def focus(eventTarget: Window) = new LatestEvent[FocusEvent](eventTarget, "focus")
  def focus(eventTarget: Element) = new LatestEvent[FocusEvent](eventTarget, "focus")
  def focusin(eventTarget: Window) = new LatestEvent[FocusEvent](eventTarget, "focusin")
  def focusin(eventTarget: Element) = new LatestEvent[FocusEvent](eventTarget, "focusin")
  def focusout(eventTarget: Window) = new LatestEvent[FocusEvent](eventTarget, "focusout")
  def focusout(eventTarget: Element) = new LatestEvent[FocusEvent](eventTarget, "focusout")
  def auxclick(eventTarget: Element) = new LatestEvent[PointerEvent](eventTarget, "auxclick")
  def click(eventTarget: Element) = new LatestEvent[PointerEvent](eventTarget, "click")
  def contextmenu(eventTarget: Element) = new LatestEvent[PointerEvent](eventTarget, "contextmenu")
  def dblclick(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "dblclick")
  def mousedown(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mousedown")
  def mouseenter(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mouseenter")
  def mouseleave(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mouseleave")
  def mousemove(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mousemove")
  def mouseout(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mouseout")
  def mouseover(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mouseover")
  def mouseup(eventTarget: Element) = new LatestEvent[MouseEvent](eventTarget, "mouseup")
  def wheel(eventTarget: Element) = new LatestEvent[WheelEvent](eventTarget, "wheel")
  def beforeinput(eventTarget: Element) = new LatestEvent[InputEvent](eventTarget, "beforeinput")
  def beforeinput(eventTarget: HTMLInputElement) = new LatestEvent[InputEvent](eventTarget, "beforeinput")
  def input(eventTarget: Element) = new LatestEvent[InputEvent](eventTarget, "input")
  def input(eventTarget: HTMLInputElement) = new LatestEvent[InputEvent](eventTarget, "input")
  def keydown(eventTarget: Element) = new LatestEvent[KeyboardEvent](eventTarget, "keydown")
  def keyup(eventTarget: Element) = new LatestEvent[KeyboardEvent](eventTarget, "keyup")
  def compositionstart(eventTarget: Element) = new LatestEvent[CompositionEvent](eventTarget, "compositionstart")
  def compositionupdate(eventTarget: Element) = new LatestEvent[CompositionEvent](eventTarget, "compositionupdate")
  def compositionend(eventTarget: Element) = new LatestEvent[CompositionEvent](eventTarget, "compositionend")
  def DOMActivate(eventTarget: Element) = new LatestEvent[UIEvent](eventTarget, "DOMActivate")
  def DOMFocusIn(eventTarget: Window) = new LatestEvent[FocusEvent](eventTarget, "DOMFocusIn")
  def DOMFocusIn(eventTarget: Element) = new LatestEvent[FocusEvent](eventTarget, "DOMFocusIn")
  def DOMFocusOut(eventTarget: Window) = new LatestEvent[FocusEvent](eventTarget, "DOMFocusOut")
  def DOMFocusOut(eventTarget: Element) = new LatestEvent[FocusEvent](eventTarget, "DOMFocusOut")
  def keypress(eventTarget: Element) = new LatestEvent[KeyboardEvent](eventTarget, "keypress")
  def DOMAttrModified(eventTarget: Element) = new LatestEvent[MutationEvent](eventTarget, "DOMAttrModified")
  def DOMCharacterDataModified(eventTarget: Text) = new LatestEvent[MutationEvent](eventTarget, "DOMCharacterDataModified")
  def DOMCharacterDataModified(eventTarget: Comment) = new LatestEvent[MutationEvent](eventTarget, "DOMCharacterDataModified")
  def DOMCharacterDataModified(eventTarget: ProcessingInstruction) = new LatestEvent[MutationEvent](eventTarget, "DOMCharacterDataModified")
  def DOMNodeInserted(eventTarget: Element) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInserted")
  def DOMNodeInserted(eventTarget: Attr) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInserted")
  def DOMNodeInserted(eventTarget: Text) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInserted")
  def DOMNodeInserted(eventTarget: Comment) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInserted")
  def DOMNodeInserted(eventTarget: DocumentType) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInserted")
  def DOMNodeInserted(eventTarget: ProcessingInstruction) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInserted")
  def DOMNodeInsertedIntoDocument(eventTarget: Element) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInsertedIntoDocument")
  def DOMNodeInsertedIntoDocument(eventTarget: Attr) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInsertedIntoDocument")
  def DOMNodeInsertedIntoDocument(eventTarget: Text) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInsertedIntoDocument")
  def DOMNodeInsertedIntoDocument(eventTarget: Comment) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInsertedIntoDocument")
  def DOMNodeInsertedIntoDocument(eventTarget: DocumentType) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInsertedIntoDocument")
  def DOMNodeInsertedIntoDocument(eventTarget: ProcessingInstruction) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeInsertedIntoDocument")
  def DOMNodeRemoved(eventTarget: Element) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemoved")
  def DOMNodeRemoved(eventTarget: Attr) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemoved")
  def DOMNodeRemoved(eventTarget: Text) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemoved")
  def DOMNodeRemoved(eventTarget: Comment) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemoved")
  def DOMNodeRemoved(eventTarget: DocumentType) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemoved")
  def DOMNodeRemoved(eventTarget: ProcessingInstruction) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemoved")
  def DOMNodeRemovedFromDocument(eventTarget: Element) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemovedFromDocument")
  def DOMNodeRemovedFromDocument(eventTarget: Attr) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemovedFromDocument")
  def DOMNodeRemovedFromDocument(eventTarget: Text) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemovedFromDocument")
  def DOMNodeRemovedFromDocument(eventTarget: Comment) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemovedFromDocument")
  def DOMNodeRemovedFromDocument(eventTarget: DocumentType) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemovedFromDocument")
  def DOMNodeRemovedFromDocument(eventTarget: ProcessingInstruction) = new LatestEvent[MutationEvent](eventTarget, "DOMNodeRemovedFromDocument")
  def DOMSubtreeModified(eventTarget: Window) = new LatestEvent[MutationEvent](eventTarget, "DOMSubtreeModified")
  def DOMSubtreeModified(eventTarget: Document) = new LatestEvent[MutationEvent](eventTarget, "DOMSubtreeModified")
  def DOMSubtreeModified(eventTarget: DocumentFragment) = new LatestEvent[MutationEvent](eventTarget, "DOMSubtreeModified")
  def DOMSubtreeModified(eventTarget: Element) = new LatestEvent[MutationEvent](eventTarget, "DOMSubtreeModified")
  def DOMSubtreeModified(eventTarget: Attr) = new LatestEvent[MutationEvent](eventTarget, "DOMSubtreeModified")
}
