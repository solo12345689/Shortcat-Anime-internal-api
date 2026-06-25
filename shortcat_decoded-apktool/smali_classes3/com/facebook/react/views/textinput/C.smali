.class public final synthetic Lcom/facebook/react/views/textinput/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/uimanager/b0;

.field public final synthetic b:Lcom/facebook/react/views/textinput/j;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/textinput/C;->a:Lcom/facebook/react/uimanager/b0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/views/textinput/C;->b:Lcom/facebook/react/views/textinput/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/C;->a:Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/textinput/C;->b:Lcom/facebook/react/views/textinput/j;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->a(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/textinput/j;Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
