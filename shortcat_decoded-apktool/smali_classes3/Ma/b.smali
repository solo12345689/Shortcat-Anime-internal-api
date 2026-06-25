.class public final LMa/b;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/facebook/react/uimanager/b0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/b0;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LMa/b;->a:Lcom/facebook/react/uimanager/b0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    iget-object v0, p0, LMa/b;->a:Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    invoke-static {v0}, LMa/c;->b(Lcom/facebook/react/uimanager/b0;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-super {p0, v0}, Lcom/facebook/react/views/view/g;->setBackgroundColor(I)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "onApplyWindowInsets(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/g;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LMa/b;->a:Lcom/facebook/react/uimanager/b0;

    .line 5
    .line 6
    invoke-static {v0}, LMa/c;->b(Lcom/facebook/react/uimanager/b0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-super {p0, v0}, Lcom/facebook/react/views/view/g;->setBackgroundColor(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LMa/b;->a:Lcom/facebook/react/uimanager/b0;

    .line 5
    .line 6
    invoke-static {p1}, LMa/c;->b(Lcom/facebook/react/uimanager/b0;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->setBackgroundColor(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    return-void
.end method
