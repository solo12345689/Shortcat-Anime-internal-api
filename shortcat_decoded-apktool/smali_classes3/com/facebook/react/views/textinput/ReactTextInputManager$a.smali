.class public final Lcom/facebook/react/views/textinput/ReactTextInputManager$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/views/textinput/ReactTextInputManager$a;Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;->e(Lcom/facebook/react/views/textinput/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lcom/facebook/react/views/textinput/ReactTextInputManager$a;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;->f(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/facebook/react/views/textinput/ReactTextInputManager$a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;->g()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic d(Lcom/facebook/react/views/textinput/ReactTextInputManager$a;Lcom/facebook/react/views/textinput/j;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;->h(Lcom/facebook/react/views/textinput/j;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e(Lcom/facebook/react/views/textinput/j;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0x3002

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x80

    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;->h(Lcom/facebook/react/views/textinput/j;II)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private final f(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final g()Z
    .locals 5

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "MANUFACTURER"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "toLowerCase(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v2, 0x1d

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const/4 v2, 0x0

    .line 28
    const-string v4, "xiaomi"

    .line 29
    .line 30
    invoke-static {v0, v4, v3, v1, v2}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_0
    return v3
.end method

.method private final h(Lcom/facebook/react/views/textinput/j;II)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    not-int p2, p2

    .line 6
    and-int/2addr p2, v0

    .line 7
    or-int/2addr p2, p3

    .line 8
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setStagedInputType(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
