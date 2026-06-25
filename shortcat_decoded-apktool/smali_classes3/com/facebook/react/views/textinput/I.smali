.class public final Lcom/facebook/react/views/textinput/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/views/textinput/K;


# instance fields
.field private final a:Lcom/facebook/react/views/textinput/j;

.field private final b:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private final c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/j;)V
    .locals 1

    .line 1
    const-string v0, "editText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/textinput/I;->a:Lcom/facebook/react/views/textinput/j;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/uimanager/f0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/facebook/react/views/textinput/I;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->e(Landroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/facebook/react/views/textinput/I;->c:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(IIII)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lcom/facebook/react/views/textinput/I;->d:I

    .line 8
    .line 9
    if-ne v3, v1, :cond_1

    .line 10
    .line 11
    iget v3, v0, Lcom/facebook/react/views/textinput/I;->e:I

    .line 12
    .line 13
    if-eq v3, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    sget-object v4, Lcom/facebook/react/views/scroll/o;->k:Lcom/facebook/react/views/scroll/o$a;

    .line 18
    .line 19
    iget v5, v0, Lcom/facebook/react/views/textinput/I;->c:I

    .line 20
    .line 21
    iget-object v3, v0, Lcom/facebook/react/views/textinput/I;->a:Lcom/facebook/react/views/textinput/j;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    sget-object v7, Lcom/facebook/react/views/scroll/p;->d:Lcom/facebook/react/views/scroll/p;

    .line 28
    .line 29
    int-to-float v8, v1

    .line 30
    int-to-float v9, v2

    .line 31
    iget-object v3, v0, Lcom/facebook/react/views/textinput/I;->a:Lcom/facebook/react/views/textinput/j;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v14

    .line 37
    iget-object v3, v0, Lcom/facebook/react/views/textinput/I;->a:Lcom/facebook/react/views/textinput/j;

    .line 38
    .line 39
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v15

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    invoke-virtual/range {v4 .. v15}, Lcom/facebook/react/views/scroll/o$a;->a(IILcom/facebook/react/views/scroll/p;FFFFIIII)Lcom/facebook/react/views/scroll/o;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object v4, v0, Lcom/facebook/react/views/textinput/I;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 52
    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    invoke-interface {v4, v3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput v1, v0, Lcom/facebook/react/views/textinput/I;->d:I

    .line 59
    .line 60
    iput v2, v0, Lcom/facebook/react/views/textinput/I;->e:I

    .line 61
    .line 62
    return-void
.end method
