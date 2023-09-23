package dev.arpit.lldassignments.designpatterns.decorator.texteditor.solution;

class LowercaseDecorator extends TextEditorDecorator {
    public LowercaseDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String getText() {
        return textEditor.getText().toLowerCase();
    }
}
