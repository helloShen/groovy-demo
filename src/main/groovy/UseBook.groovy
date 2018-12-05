Book book = new Book('Groovy in Action')
assert book.getTitle() == 'Groovy in Action'
assert getTitleBackwards(book) == 'noitcA ni yvoorG'
println 'Two Assertion passed!'


String getTitleBackwards(book) {
    title = book.getTitle()
    return title.reverse()
}