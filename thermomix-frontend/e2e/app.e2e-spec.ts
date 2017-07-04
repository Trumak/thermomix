import { ThermomixFrontendPage } from './app.po';

describe('thermomix-frontend App', () => {
  let page: ThermomixFrontendPage;

  beforeEach(() => {
    page = new ThermomixFrontendPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
