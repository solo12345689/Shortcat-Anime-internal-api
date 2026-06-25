.class public final Lcom/facebook/react/views/textinput/F;
.super Lcom/facebook/react/views/text/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/yoga/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/F$a;
    }
.end annotation


# static fields
.field public static final I:Lcom/facebook/react/views/textinput/F$a;


# instance fields
.field private D:I

.field private E:Landroid/widget/EditText;

.field private F:Lcom/facebook/react/views/textinput/p;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/F$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/textinput/F$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/textinput/F;->I:Lcom/facebook/react/views/textinput/F$a;

    .line 8
    .line 9
    const-string v0, "ReactTextInputShadowNode"

    .line 10
    .line 11
    sget-object v1, LW6/a;->b:LW6/a;

    .line 12
    .line 13
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/o;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/d;-><init>(Lcom/facebook/react/views/text/o;)V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/facebook/react/views/textinput/F;->D:I

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/d;->G(I)V

    .line 5
    invoke-virtual {p0, p0}, Lcom/facebook/react/uimanager/P;->setMeasureFunction(Lcom/facebook/yoga/o;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/F;-><init>(Lcom/facebook/react/views/text/o;)V

    return-void
.end method

.method private final I()Landroid/widget/EditText;
    .locals 3

    .line 1
    new-instance v0, Landroidx/appcompat/view/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget v2, Lcom/facebook/react/p;->g:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/widget/EditText;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method


# virtual methods
.method public isVirtualAnchor()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public isYogaLeafNode()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public measure(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J
    .locals 2

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "widthMode"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "heightMode"

    .line 12
    .line 13
    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/facebook/react/views/textinput/F;->E:Landroid/widget/EditText;

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/views/textinput/F;->F:Lcom/facebook/react/views/textinput/p;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/p;->a(Landroid/widget/EditText;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->w()Lcom/facebook/react/views/text/r;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->c()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    int-to-float v0, v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->t()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v1, -0x1

    .line 48
    if-eq v0, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->t()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLines(I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getBreakStrategy()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->x()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eq v0, v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->x()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/F;->H:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p2, p3}, Lcom/facebook/react/views/view/c;->a(FLcom/facebook/yoga/p;)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-static {p4, p5}, Lcom/facebook/react/views/view/c;->a(FLcom/facebook/yoga/p;)I

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p2, p1}, Lcom/facebook/yoga/q;->b(II)J

    .line 99
    .line 100
    .line 101
    move-result-wide p1

    .line 102
    return-wide p1

    .line 103
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    const-string p2, "Required value was null."

    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method

.method public onCollectExtraUpdates(Lcom/facebook/react/uimanager/j0;)V
    .locals 13

    .line 1
    const-string v0, "uiViewOperationQueue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/P;->onCollectExtraUpdates(Lcom/facebook/react/uimanager/j0;)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/facebook/react/views/textinput/F;->D:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/facebook/react/views/text/i;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/react/views/textinput/F;->G:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p0, p0, v0, v3, v1}, Lcom/facebook/react/views/text/d;->H(Lcom/facebook/react/views/text/d;Ljava/lang/String;ZLcom/facebook/react/uimanager/z;)Landroid/text/Spannable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v4, p0, Lcom/facebook/react/views/textinput/F;->D:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->j()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p0, v3}, Lcom/facebook/react/uimanager/P;->getPadding(I)F

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {p0, v1}, Lcom/facebook/react/uimanager/P;->getPadding(I)F

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-virtual {p0, v1}, Lcom/facebook/react/uimanager/P;->getPadding(I)F

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    const/4 v1, 0x3

    .line 45
    invoke-virtual {p0, v1}, Lcom/facebook/react/uimanager/P;->getPadding(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->v()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->x()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    invoke-virtual {p0}, Lcom/facebook/react/views/text/d;->r()I

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    move-object v3, v0

    .line 62
    invoke-direct/range {v2 .. v12}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZFFFFIII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getReactTag()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1, v0, v2}, Lcom/facebook/react/uimanager/j0;->O(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method

.method public setLocalData(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/views/textinput/p;

    .line 7
    .line 8
    invoke-static {v0}, LQ6/a;->a(Z)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/facebook/react/views/textinput/p;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/views/textinput/F;->F:Lcom/facebook/react/views/textinput/p;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->dirty()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setMostRecentEventCount(I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "mostRecentEventCount"
    .end annotation

    .line 1
    iput p1, p0, Lcom/facebook/react/views/textinput/F;->D:I

    .line 2
    .line 3
    return-void
.end method

.method public setPadding(IF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/P;->setPadding(IF)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->markUpdated()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "placeholder"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/F;->H:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->markUpdated()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "text"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/F;->G:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->markUpdated()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextBreakStrategy(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const v2, -0x72ba92f8

    .line 9
    .line 10
    .line 11
    if-eq v1, v2, :cond_3

    .line 12
    .line 13
    const v2, -0x35c7ce4e    # -3017836.5f

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    const v2, 0x141440fd

    .line 19
    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v1, "highQuality"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/d;->G(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    const-string v1, "simple"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string v1, "balanced"

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "Invalid textBreakStrategy: "

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v1, "ReactNative"

    .line 73
    .line 74
    invoke-static {v1, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/d;->G(I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    const/4 p1, 0x2

    .line 82
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/d;->G(I)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_5
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/d;->G(I)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public setThemedContext(Lcom/facebook/react/uimanager/b0;)V
    .locals 2

    .line 1
    const-string v0, "themedContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/P;->setThemedContext(Lcom/facebook/react/uimanager/b0;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/F;->I()Landroid/widget/EditText;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Landroidx/core/view/a0;->D(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    const/4 v1, 0x4

    .line 19
    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/P;->setDefaultPadding(IF)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/P;->setDefaultPadding(IF)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroidx/core/view/a0;->C(Landroid/view/View;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-float v0, v0

    .line 36
    const/4 v1, 0x5

    .line 37
    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/P;->setDefaultPadding(IF)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-float v0, v0

    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/P;->setDefaultPadding(IF)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/facebook/react/views/textinput/F;->E:Landroid/widget/EditText;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/facebook/react/views/textinput/F;->E:Landroid/widget/EditText;

    .line 56
    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 60
    .line 61
    const/4 v1, -0x2

    .line 62
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void
.end method
