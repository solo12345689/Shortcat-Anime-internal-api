.class public Lcom/facebook/react/views/view/g;
.super Landroid/view/ViewGroup;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA7/d;
.implements Lcom/facebook/react/uimanager/F;
.implements Lcom/facebook/react/uimanager/L;
.implements LA7/c;
.implements Lcom/facebook/react/uimanager/U;
.implements Lcom/facebook/react/uimanager/K;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/g$a;,
        Lcom/facebook/react/views/view/g$b;,
        Lcom/facebook/react/views/view/g$c;
    }
.end annotation


# static fields
.field private static final ARRAY_CAPACITY_INCREMENT:I = 0xc

.field private static final Companion:Lcom/facebook/react/views/view/g$b;

.field private static final defaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;


# instance fields
.field private _drawingOrderHelper:Lcom/facebook/react/uimanager/p0;

.field private _overflow:LH7/v;

.field private _removeClippedSubviews:Z

.field private accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

.field private allChildren:[Landroid/view/View;

.field private allChildrenCount:I

.field private axOrderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private backfaceOpacity:F

.field private backfaceVisible:Z

.field private childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

.field private childrenRemovedWhileTransitioning:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private clippingRect:Landroid/graphics/Rect;

.field private focusOnAttach:Z

.field private hitSlopRect:Landroid/graphics/Rect;

.field private volatile inSubviewClippingLoop:Z

.field private needsOffscreenAlphaCompositing:Z

.field private onInterceptTouchEventListener:LA7/b;

.field private final overflowInset:Landroid/graphics/Rect;

.field private pointerEvents:Lcom/facebook/react/uimanager/C;

.field private recycleCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/view/g$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/view/g$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/view/g;->Companion:Lcom/facebook/react/views/view/g$b;

    .line 8
    .line 9
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/facebook/react/views/view/g;->defaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->overflowInset:Landroid/graphics/Rect;

    .line 10
    .line 11
    sget-object p1, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->pointerEvents:Lcom/facebook/react/uimanager/C;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->s()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final A(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    move-object v2, p0

    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 15
    .line 16
    const-string v0, "Required value was null."

    .line 17
    .line 18
    if-eqz v2, :cond_6

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 21
    .line 22
    if-eqz v1, :cond_5

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v2, v0, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {p0, p1, v3}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, 0x1

    .line 50
    xor-int/2addr v3, v4

    .line 51
    if-eq v0, v3, :cond_0

    .line 52
    .line 53
    iput-boolean v4, p0, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 54
    .line 55
    iget v0, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move v3, v8

    .line 59
    move v4, v3

    .line 60
    :goto_0
    if-ge v3, v0, :cond_4

    .line 61
    .line 62
    aget-object v5, v1, v3

    .line 63
    .line 64
    if-ne v5, p1, :cond_2

    .line 65
    .line 66
    const/16 v6, 0x8

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    move-object v1, p0

    .line 71
    invoke-static/range {v1 .. v7}, Lcom/facebook/react/views/view/g;->updateSubviewClipStatus$default(Lcom/facebook/react/views/view/g;Landroid/graphics/Rect;IILjava/util/Set;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v2, v1

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move v6, v3

    .line 77
    move-object v3, v2

    .line 78
    move-object v2, p0

    .line 79
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-direct {p0, v5, v7}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    :cond_3
    add-int/lit8 v5, v6, 0x1

    .line 92
    .line 93
    move-object v2, v3

    .line 94
    move v3, v5

    .line 95
    goto :goto_0

    .line 96
    :cond_4
    move-object v2, p0

    .line 97
    :goto_1
    iput-boolean v8, v2, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 98
    .line 99
    return-void

    .line 100
    :cond_5
    move-object v2, p0

    .line 101
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_6
    move-object v2, p0

    .line 108
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :goto_2
    return-void
.end method

.method public static final synthetic access$updateSubviewClipStatus(Lcom/facebook/react/views/view/g;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;->A(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->_drawingOrderHelper:Lcom/facebook/react/uimanager/p0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/p0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/p0;-><init>(Landroid/view/ViewGroup;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->_drawingOrderHelper:Lcom/facebook/react/uimanager/p0;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->_drawingOrderHelper:Lcom/facebook/react/uimanager/p0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v1, "Required value was null."

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public static synthetic m(Lcom/facebook/react/views/view/g;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/view/g;->n(Lcom/facebook/react/views/view/g;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final n(Lcom/facebook/react/views/view/g;Z)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-ge v0, p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getChildAt(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/facebook/react/uimanager/E;->d(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method private final o(Landroid/view/View;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget v1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ne p2, v1, :cond_1

    .line 10
    .line 11
    if-ne v2, v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 p2, v2, 0xc

    .line 14
    .line 15
    new-array p2, p2, [Landroid/view/View;

    .line 16
    .line 17
    invoke-static {v0, v3, p2, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    :cond_0
    iget p2, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 24
    .line 25
    add-int/lit8 v1, p2, 0x1

    .line 26
    .line 27
    iput v1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 28
    .line 29
    aput-object p1, v0, p2

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-ge p2, v1, :cond_3

    .line 33
    .line 34
    if-ne v2, v1, :cond_2

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0xc

    .line 37
    .line 38
    new-array v2, v2, [Landroid/view/View;

    .line 39
    .line 40
    invoke-static {v0, v3, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v3, p2, 0x1

    .line 44
    .line 45
    sub-int/2addr v1, p2

    .line 46
    invoke-static {v0, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 50
    .line 51
    move-object v0, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 v2, p2, 0x1

    .line 54
    .line 55
    sub-int/2addr v1, p2

    .line 56
    invoke-static {v0, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    :goto_0
    aput-object p1, v0, p2

    .line 60
    .line 61
    iget p1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 62
    .line 63
    add-int/lit8 p1, p1, 0x1

    .line 64
    .line 65
    iput p1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 69
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v2, "index="

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p2, " count="

    .line 84
    .line 85
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string p2, "Required value was null."

    .line 102
    .line 103
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method private final p(Landroid/view/View;Z)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Lcom/facebook/react/l;->F:I

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "View clipping tag mismatch: tag="

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, " expected="

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "ReactViewGroup.onViewRemoved"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    sget v0, Lcom/facebook/react/l;->F:I

    .line 61
    .line 62
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    sget p2, Lcom/facebook/react/l;->F:I

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method private final q()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, LC7/a;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x2

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    return v2
.end method

.method private final r(Landroid/view/View;)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    aget-object v3, v1, v2

    .line 11
    .line 12
    if-ne v3, p1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "Required value was null."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method private final s()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 3
    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 11
    .line 12
    iput v0, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 13
    .line 14
    iput-object v1, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/view/g;->setHitSlopRect(Landroid/graphics/Rect;)V

    .line 17
    .line 18
    .line 19
    sget-object v2, LH7/v;->b:LH7/v;

    .line 20
    .line 21
    iput-object v2, p0, Lcom/facebook/react/views/view/g;->_overflow:LH7/v;

    .line 22
    .line 23
    sget-object v2, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lcom/facebook/react/views/view/g;->setPointerEvents(Lcom/facebook/react/uimanager/C;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 29
    .line 30
    iput-object v1, p0, Lcom/facebook/react/views/view/g;->onInterceptTouchEventListener:LA7/b;

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->needsOffscreenAlphaCompositing:Z

    .line 33
    .line 34
    iput-object v1, p0, Lcom/facebook/react/views/view/g;->_drawingOrderHelper:Lcom/facebook/react/uimanager/p0;

    .line 35
    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    iput v0, p0, Lcom/facebook/react/views/view/g;->backfaceOpacity:F

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->backfaceVisible:Z

    .line 42
    .line 43
    iput-object v1, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 44
    .line 45
    return-void
.end method

.method private final t(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x1

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    return v1
.end method

.method private final u(Landroid/view/View;Ljava/lang/Integer;)Z
    .locals 8

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    sget v0, Lcom/facebook/react/l;->F:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;->t(Landroid/view/View;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x1

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    new-instance v3, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move v4, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v4, v1

    .line 37
    :goto_0
    if-ne v0, p0, :cond_2

    .line 38
    .line 39
    move v5, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v5, v1

    .line 42
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v7, "View missing clipping tag: index="

    .line 48
    .line 49
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p2, " parentNull="

    .line 56
    .line 57
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p2, " parentThis="

    .line 64
    .line 65
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p2, " transitioning="

    .line 72
    .line 73
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-direct {v3, p2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string p2, "ReactViewGroup.isViewClipped"

    .line 87
    .line 88
    invoke-static {p2, v3}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    if-eqz v0, :cond_6

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    if-ne v0, p0, :cond_5

    .line 97
    .line 98
    return v1

    .line 99
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string p2, "Check failed."

    .line 102
    .line 103
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_6
    :goto_2
    return v2

    .line 108
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string p2, "Required value was null."

    .line 111
    .line 112
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method

.method public static synthetic updateClippingToRect$ReactAndroid_release$default(Lcom/facebook/react/views/view/g;Landroid/graphics/Rect;Ljava/util/Set;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/view/g;->updateClippingToRect$ReactAndroid_release(Landroid/graphics/Rect;Ljava/util/Set;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: updateClippingToRect"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method static synthetic updateSubviewClipStatus$default(Lcom/facebook/react/views/view/g;Landroid/graphics/Rect;IILjava/util/Set;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x8

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/g;->z(Landroid/graphics/Rect;IILjava/util/Set;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: updateSubviewClipStatus"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final v(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, -0x1

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne p1, v2, :cond_0

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iput v1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 15
    .line 16
    aput-object v3, v0, v1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-ltz p1, :cond_1

    .line 20
    .line 21
    if-ge p1, v1, :cond_1

    .line 22
    .line 23
    add-int/lit8 v2, p1, 0x1

    .line 24
    .line 25
    sub-int/2addr v1, p1

    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    invoke-static {v0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    iget p1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, -0x1

    .line 34
    .line 35
    iput p1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 36
    .line 37
    aput-object v3, v0, p1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "Required value was null."

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method private final w()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/g;->setPointerEvents(Lcom/facebook/react/uimanager/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final x(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method private final y(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final z(Landroid/graphics/Rect;IILjava/util/Set;)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    aget-object v0, v0, p2

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v0, v1

    .line 13
    :goto_0
    if-eqz v0, :cond_c

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/view/animation/Animation;->hasEnded()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    move v2, v4

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v2, v3

    .line 52
    :goto_1
    if-eqz p4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {p4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ne v5, v4, :cond_2

    .line 67
    .line 68
    move v5, v4

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v5, v3

    .line 71
    :goto_2
    if-eqz p4, :cond_3

    .line 72
    .line 73
    move v6, v4

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move v6, v3

    .line 76
    :goto_3
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-direct {p0, v0, v7}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_4

    .line 87
    .line 88
    if-nez v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-eq v0, v2, :cond_4

    .line 95
    .line 96
    if-nez v5, :cond_4

    .line 97
    .line 98
    sget-object p1, Lcom/facebook/react/views/view/g;->Companion:Lcom/facebook/react/views/view/g$b;

    .line 99
    .line 100
    invoke-static {p1, v0, v4}, Lcom/facebook/react/views/view/g$b;->a(Lcom/facebook/react/views/view/g$b;Landroid/view/View;Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    :goto_4
    move v6, v4

    .line 107
    goto :goto_5

    .line 108
    :cond_4
    if-nez v5, :cond_5

    .line 109
    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    :cond_5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-direct {p0, v0, v2}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_7

    .line 121
    .line 122
    sub-int/2addr p2, p3

    .line 123
    if-ltz p2, :cond_6

    .line 124
    .line 125
    sget-object p1, Lcom/facebook/react/views/view/g;->Companion:Lcom/facebook/react/views/view/g$b;

    .line 126
    .line 127
    invoke-static {p1, v0, v3}, Lcom/facebook/react/views/view/g$b;->a(Lcom/facebook/react/views/view/g$b;Landroid/view/View;Z)V

    .line 128
    .line 129
    .line 130
    sget-object p1, Lcom/facebook/react/views/view/g;->defaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    .line 131
    .line 132
    invoke-virtual {p0, v0, p2, p1, v4}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    const-string p2, "Check failed."

    .line 142
    .line 143
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_7
    if-eqz p1, :cond_8

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    :goto_5
    if-eqz v6, :cond_b

    .line 151
    .line 152
    instance-of p1, v0, Lcom/facebook/react/uimanager/F;

    .line 153
    .line 154
    if-eqz p1, :cond_9

    .line 155
    .line 156
    move-object v1, v0

    .line 157
    check-cast v1, Lcom/facebook/react/uimanager/F;

    .line 158
    .line 159
    :cond_9
    if-eqz v1, :cond_a

    .line 160
    .line 161
    invoke-interface {v1}, Lcom/facebook/react/uimanager/F;->getRemoveClippedSubviews()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-ne p1, v4, :cond_a

    .line 166
    .line 167
    move v3, v4

    .line 168
    :cond_a
    if-eqz v3, :cond_b

    .line 169
    .line 170
    check-cast v0, Lcom/facebook/react/uimanager/F;

    .line 171
    .line 172
    invoke-interface {v0, p4}, Lcom/facebook/react/uimanager/F;->updateClippingRect(Ljava/util/Set;)V

    .line 173
    .line 174
    .line 175
    :cond_b
    return-void

    .line 176
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    const-string p2, "Required value was null."

    .line 179
    .line 180
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1
.end method


# virtual methods
.method public addChildrenForAccessibility(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "outChildren"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/facebook/react/l;->g:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, Lcom/facebook/react/views/view/g;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, Lcom/facebook/react/views/view/g;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/facebook/react/views/view/g;->axOrderList:Ljava/util/List;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->axOrderList:Ljava/util/List;

    .line 23
    .line 24
    const-string v2, "getChildAt(...)"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_5

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v4, "accessibility"

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/facebook/react/views/view/g;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    new-instance v4, Lcom/facebook/react/views/view/f;

    .line 48
    .line 49
    invoke-direct {v4, p0}, Lcom/facebook/react/views/view/f;-><init>(Lcom/facebook/react/views/view/g;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 53
    .line 54
    .line 55
    iput-object v4, p0, Lcom/facebook/react/views/view/g;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 56
    .line 57
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    new-array v4, v0, [Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    move v6, v3

    .line 68
    :goto_1
    if-ge v6, v5, :cond_2

    .line 69
    .line 70
    sget-object v7, Lcom/facebook/react/uimanager/E;->a:Lcom/facebook/react/uimanager/E;

    .line 71
    .line 72
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, v8, p0, v1, v4}, Lcom/facebook/react/uimanager/E;->a(Landroid/view/View;Landroid/view/View;Ljava/util/List;[Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    :goto_2
    if-ge v3, v0, :cond_9

    .line 86
    .line 87
    aget-object v1, v4, v3

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-virtual {v1, p1}, Landroid/view/View;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    if-eqz v0, :cond_a

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_6

    .line 114
    .line 115
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const-string v4, ""

    .line 124
    .line 125
    if-eqz v1, :cond_8

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_8

    .line 142
    .line 143
    :cond_7
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    :goto_4
    if-ge v3, p1, :cond_9

    .line 151
    .line 152
    sget-object v1, Lcom/facebook/react/uimanager/E;->a:Lcom/facebook/react/uimanager/E;

    .line 153
    .line 154
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v4, v0}, Lcom/facebook/react/uimanager/E;->c(Landroid/view/View;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v3, v3, 0x1

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_9

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_9
    return-void

    .line 187
    :cond_a
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public final addViewWithSubviewClippingEnabled$ReactAndroid_release(Landroid/view/View;I)V
    .locals 9

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    sget-object v0, Lcom/facebook/react/views/view/g;->Companion:Lcom/facebook/react/views/view/g$b;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {v0, p1, v1}, Lcom/facebook/react/views/view/g$b;->a(Lcom/facebook/react/views/view/g$b;Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/g;->o(Landroid/view/View;I)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 20
    .line 21
    const-string v0, "Required value was null."

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    iget-object v2, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    move v1, v0

    .line 33
    move v5, v1

    .line 34
    :goto_0
    if-ge v1, p2, :cond_1

    .line 35
    .line 36
    aget-object v4, v2, v1

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {p0, v4, v6}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/16 v7, 0x8

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    move-object v2, p0

    .line 58
    move v4, p2

    .line 59
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/views/view/g;->updateSubviewClipStatus$default(Lcom/facebook/react/views/view/g;Landroid/graphics/Rect;IILjava/util/Set;ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-boolean v0, v2, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 63
    .line 64
    iget-object p2, v2, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    move-object v2, p0

    .line 71
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_3
    move-object v2, p0

    .line 78
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_4
    move-object v2, p0

    .line 85
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string p2, "Check failed."

    .line 88
    .line 89
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public final cleanUpAxOrderListener()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "accessibility"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Landroid/view/accessibility/AccessibilityManager;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    iput-object v2, p0, Lcom/facebook/react/views/view/g;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 30
    .line 31
    return-void
.end method

.method public final clearFocusFromJS$ReactAndroid_release()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->focusOnAttach:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->_overflow:LH7/v;

    .line 7
    .line 8
    sget-object v1, LH7/v;->b:LH7/v;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    sget v0, Lcom/facebook/react/l;->o:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->a(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/uimanager/C;->a:Lcom/facebook/react/uimanager/C$a;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/C$a;->b(Lcom/facebook/react/uimanager/C;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    .line 1
    const-string v0, "structure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    const-string v0, "ReactNative"

    .line 12
    .line 13
    const-string v1, "NullPointerException when executing dispatchProvideStructure"

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lz5/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method protected dispatchSetPressed(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, LC7/a;->c(Landroid/view/View;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lcom/facebook/react/uimanager/d;->a(Landroid/view/ViewGroup;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    int-to-float v3, v1

    .line 32
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    int-to-float v4, v1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 40
    .line 41
    neg-int v2, v2

    .line 42
    add-int/2addr v1, v2

    .line 43
    int-to-float v5, v1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 49
    .line 50
    neg-int v0, v0

    .line 51
    add-int/2addr v1, v0

    .line 52
    int-to-float v6, v1

    .line 53
    const/4 v7, 0x0

    .line 54
    move-object v2, p1

    .line 55
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 56
    .line 57
    .line 58
    invoke-super {p0, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    move-object v2, p1

    .line 66
    invoke-super {p0, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 11

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "child"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getElevation()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v1

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1, v2}, Lcom/facebook/react/views/view/a;->a(Landroid/graphics/Canvas;Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v3, 0x1d

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-lt v2, v3, :cond_3

    .line 36
    .line 37
    invoke-static {p0}, LC7/a;->c(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x2

    .line 42
    if-ne v2, v3, :cond_3

    .line 43
    .line 44
    invoke-static {p0}, Lcom/facebook/react/uimanager/d;->a(Landroid/view/ViewGroup;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    sget v2, Lcom/facebook/react/l;->s:I

    .line 51
    .line 52
    invoke-virtual {p2, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Lcom/facebook/react/views/view/e;->a(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-static {v2}, Lcom/facebook/react/U;->a(Ljava/lang/Object;)Landroid/graphics/BlendMode;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    :cond_2
    if-eqz v4, :cond_3

    .line 67
    .line 68
    new-instance v10, Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v10, v4}, Ls0/N1;->a(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 81
    .line 82
    int-to-float v6, v3

    .line 83
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 84
    .line 85
    int-to-float v7, v3

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 91
    .line 92
    neg-int v5, v5

    .line 93
    add-int/2addr v3, v5

    .line 94
    int-to-float v8, v3

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 100
    .line 101
    neg-int v2, v2

    .line 102
    add-int/2addr v3, v2

    .line 103
    int-to-float v9, v3

    .line 104
    move-object v5, p1

    .line 105
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move-object v5, p1

    .line 110
    :goto_1
    invoke-super {p0, v5, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz v4, :cond_4

    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/graphics/Canvas;->restore()V

    .line 117
    .line 118
    .line 119
    :cond_4
    if-eqz v0, :cond_5

    .line 120
    .line 121
    invoke-static {v5, v1}, Lcom/facebook/react/views/view/a;->a(Landroid/graphics/Canvas;Z)V

    .line 122
    .line 123
    .line 124
    :cond_5
    return p1
.end method

.method public endViewTransition(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final getAllChildrenCount$ReactAndroid_release()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAxOrderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->axOrderList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getChildAtWithSubviewClippingEnabled$ReactAndroid_release(I)Landroid/view/View;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    aget-object p1, v0, p1

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "Required value was null."

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->q()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/p0;->c(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    return p2
.end method

.method public getClippingRect(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "outClippingRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "Required value was null."

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final getClippingRect$ReactAndroid_release()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHitSlopRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->hitSlopRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOverflow()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->_overflow:LH7/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v1, Lcom/facebook/react/views/view/g$c;->a:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    :goto_0
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0

    .line 26
    :cond_1
    const-string v0, "visible"

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_2
    const-string v0, "scroll"

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_3
    const-string v0, "hidden"

    .line 33
    .line 34
    return-object v0
.end method

.method public getOverflowInset()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->overflowInset:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/C;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->pointerEvents:Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRemoveClippedSubviews()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 2
    .line 3
    return v0
.end method

.method public getZIndexMappedChildIndex(I)I
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->q()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/uimanager/p0;->c(II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    :cond_0
    return p1
.end method

.method public final get_removeClippedSubviews$ReactAndroid_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 2
    .line 3
    return v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->needsOffscreenAlphaCompositing:Z

    .line 2
    .line 3
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->updateClippingRect()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->focusOnAttach:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->requestFocusFromJS$ReactAndroid_release()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->focusOnAttach:Z

    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/facebook/react/uimanager/C;->a:Lcom/facebook/react/uimanager/C$a;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/C$a;->a(Lcom/facebook/react/uimanager/C;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->onInterceptTouchEventListener:LA7/b;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0, p1}, LA7/b;->a(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/C;->a:Lcom/facebook/react/uimanager/C$a;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/C$a;->b(Lcom/facebook/react/uimanager/C;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/w;->a(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->updateClippingRect()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/facebook/react/uimanager/C;->a:Lcom/facebook/react/uimanager/C$a;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/C$a;->a(Lcom/facebook/react/uimanager/C;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/view/g;->p(Landroid/view/View;Z)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->q()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->f(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->h()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/view/g;->p(Landroid/view/View;Z)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->q()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->g(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->h()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/g;->x(I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public recycleView$ReactAndroid_release()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/g;->recycleCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/facebook/react/views/view/g;->recycleCount:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v2, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/facebook/react/views/view/g$a;->a()V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget v2, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 22
    .line 23
    move v3, v1

    .line 24
    :goto_0
    if-ge v3, v2, :cond_2

    .line 25
    .line 26
    aget-object v4, v0, v3

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget-object v5, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->s()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 62
    .line 63
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast v0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/g;->y(Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->w()V

    .line 76
    .line 77
    .line 78
    iput-boolean v1, p0, Lcom/facebook/react/views/view/g;->focusOnAttach:Z

    .line 79
    .line 80
    return-void
.end method

.method public final removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget v1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v5, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 28
    .line 29
    .line 30
    iput v2, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v1, "Required value was null."

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v1, "Check failed."

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public final removeViewWithSubviewClippingEnabled$ReactAndroid_release(Landroid/view/View;)V
    .locals 5

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;->r(Landroid/view/View;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    aget-object v1, v0, p1

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    move v2, v1

    .line 40
    :goto_0
    if-ge v1, p1, :cond_1

    .line 41
    .line 42
    aget-object v3, v0, v1

    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-direct {p0, v3, v4}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sub-int v0, p1, v2

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->removeViewsInLayout(II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;->v(I)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "Required value was null."

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v0, "Check failed."

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public final requestFocusFromJS$ReactAndroid_release()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x82

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-super {p0, v0, v1}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/facebook/react/views/view/g;->focusOnAttach:Z

    .line 16
    .line 17
    return-void
.end method

.method public requestLayout()V
    .locals 0

    .line 1
    return-void
.end method

.method public final setAxOrderList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->axOrderList:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setBackfaceVisibility(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "backfaceVisibility"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "visible"

    .line 7
    .line 8
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput-boolean p1, p0, Lcom/facebook/react/views/view/g;->backfaceVisible:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->setBackfaceVisibilityDependantOpacity()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setBackfaceVisibilityDependantOpacity()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->backfaceVisible:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/facebook/react/views/view/g;->backfaceOpacity:F

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRotationX()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getRotationY()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 20
    .line 21
    cmpl-float v3, v0, v2

    .line 22
    .line 23
    if-ltz v3, :cond_1

    .line 24
    .line 25
    const/high16 v3, 0x42b40000    # 90.0f

    .line 26
    .line 27
    cmpg-float v0, v0, v3

    .line 28
    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    cmpl-float v0, v1, v2

    .line 32
    .line 33
    if-ltz v0, :cond_1

    .line 34
    .line 35
    cmpg-float v0, v1, v3

    .line 36
    .line 37
    if-gez v0, :cond_1

    .line 38
    .line 39
    iget v0, p0, Lcom/facebook/react/views/view/g;->backfaceOpacity:F

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->m(Landroid/view/View;Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBorderColor(ILjava/lang/Integer;)V
    .locals 1

    .line 1
    invoke-static {}, LH7/t;->b()Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LH7/t;

    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Lcom/facebook/react/uimanager/a;->r(Landroid/view/View;LH7/t;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setBorderRadius(F)V
    .locals 2
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    move-object p1, v0

    .line 3
    :goto_0
    sget-object v0, LH7/i;->a:LH7/i;

    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    return-void
.end method

.method public final setBorderRadius(FI)V
    .locals 2
    .annotation runtime LTd/e;
    .end annotation

    .line 4
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    move-object p1, v0

    .line 6
    :goto_0
    invoke-static {}, LH7/i;->b()Lkotlin/enums/EnumEntries;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LH7/i;

    invoke-static {p0, p2, p1}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    return-void
.end method

.method public final setBorderRadius(LH7/i;Lcom/facebook/react/uimanager/t;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p0, p1, p2}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    return-void
.end method

.method public final setBorderStyle(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, LH7/k;->a:LH7/k$a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LH7/k$a;->a(Ljava/lang/String;)LH7/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->t(Landroid/view/View;LH7/k;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setBorderWidth(IF)V
    .locals 1

    .line 1
    invoke-static {}, LH7/t;->b()Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LH7/t;

    .line 10
    .line 11
    invoke-static {p2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p0, p1, p2}, Lcom/facebook/react/uimanager/a;->u(Landroid/view/View;LH7/t;Ljava/lang/Float;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setClippingRect$ReactAndroid_release(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-void
.end method

.method public setHitSlopRect(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->hitSlopRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedsOffscreenAlphaCompositing(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/view/g;->needsOffscreenAlphaCompositing:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOnInterceptTouchEventListener(LA7/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->onInterceptTouchEventListener:LA7/b;

    .line 7
    .line 8
    return-void
.end method

.method public final setOpacityIfPossible(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/view/g;->backfaceOpacity:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->setBackfaceVisibilityDependantOpacity()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LH7/v;->b:LH7/v;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, LH7/v;->a:LH7/v$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LH7/v$a;->a(Ljava/lang/String;)LH7/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->_overflow:LH7/v;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setOverflowInset(IIII)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/d;->a(Landroid/view/ViewGroup;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 12
    .line 13
    if-ne v0, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    if-ne v0, p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 28
    .line 29
    if-ne v0, p3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 36
    .line 37
    if-eq v0, p4, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getOverflowInset()Landroid/graphics/Rect;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/uimanager/C;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->pointerEvents:Lcom/facebook/react/uimanager/C;

    .line 7
    .line 8
    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/G;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 29
    .line 30
    const/16 v0, 0xc

    .line 31
    .line 32
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    new-array p1, p1, [Landroid/view/View;

    .line 37
    .line 38
    new-instance v0, Lcom/facebook/react/views/view/g$a;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lcom/facebook/react/views/view/g$a;-><init>(Lcom/facebook/react/views/view/g;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 44
    .line 45
    iget v0, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 46
    .line 47
    move v2, v1

    .line 48
    :goto_0
    if-ge v2, v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    aput-object v3, p1, v2

    .line 55
    .line 56
    iget-object v4, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 59
    .line 60
    .line 61
    sget-object v4, Lcom/facebook/react/views/view/g;->Companion:Lcom/facebook/react/views/view/g$b;

    .line 62
    .line 63
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v4, v3, v1}, Lcom/facebook/react/views/view/g$b;->a(Lcom/facebook/react/views/view/g$b;Landroid/view/View;Z)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->updateClippingRect()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 79
    .line 80
    const-string v2, "Required value was null."

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    iget-object v3, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 85
    .line 86
    if-eqz v3, :cond_6

    .line 87
    .line 88
    iget v3, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 89
    .line 90
    move v4, v1

    .line 91
    :goto_1
    if-ge v4, v3, :cond_4

    .line 92
    .line 93
    aget-object v5, p1, v4

    .line 94
    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    iget-object v6, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    iget-object p1, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 106
    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 110
    .line 111
    .line 112
    const/4 v2, 0x2

    .line 113
    invoke-static {p0, p1, v0, v2, v0}, Lcom/facebook/react/views/view/g;->updateClippingToRect$ReactAndroid_release$default(Lcom/facebook/react/views/view/g;Landroid/graphics/Rect;Ljava/util/Set;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 117
    .line 118
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    .line 119
    .line 120
    iput v1, p0, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 121
    .line 122
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/g$a;

    .line 123
    .line 124
    return-void

    .line 125
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1
.end method

.method public final setTranslucentBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/a;->x(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final set_removeClippedSubviews$ReactAndroid_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    .line 2
    .line 3
    return-void
.end method

.method public updateClippingRect()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/g;->updateClippingRect(Ljava/util/Set;)V

    return-void
.end method

.method public updateClippingRect(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/views/view/g;->_removeClippedSubviews:Z

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->clippingRect:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/G;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/view/g;->updateClippingToRect$ReactAndroid_release(Landroid/graphics/Rect;Ljava/util/Set;)V

    return-void

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final updateClippingToRect$ReactAndroid_release(Landroid/graphics/Rect;Ljava/util/Set;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, " recycleCount="

    .line 8
    .line 9
    const-string v4, " allChildrenCount="

    .line 10
    .line 11
    const-string v5, " count="

    .line 12
    .line 13
    const-string v6, " clippedSoFar="

    .line 14
    .line 15
    const-string v7, "Invalid clipping state. i="

    .line 16
    .line 17
    const-string v8, "clippingRect"

    .line 18
    .line 19
    invoke-static {v0, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v8, v1, Lcom/facebook/react/views/view/g;->allChildren:[Landroid/view/View;

    .line 23
    .line 24
    if-eqz v8, :cond_6

    .line 25
    .line 26
    const/4 v9, 0x1

    .line 27
    iput-boolean v9, v1, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 28
    .line 29
    iget v9, v1, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v12, 0x0

    .line 33
    :goto_0
    if-ge v11, v9, :cond_5

    .line 34
    .line 35
    :try_start_0
    invoke-direct {v1, v0, v11, v12, v2}, Lcom/facebook/react/views/view/g;->z(Landroid/graphics/Rect;IILjava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    aget-object v13, v8, v11

    .line 39
    .line 40
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v14

    .line 44
    invoke-direct {v1, v13, v14}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    if-eqz v13, :cond_0

    .line 49
    .line 50
    add-int/lit8 v12, v12, 0x1

    .line 51
    .line 52
    :cond_0
    sub-int v13, v11, v12

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    if-le v13, v14, :cond_2

    .line 59
    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    iget v9, v1, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 67
    .line 68
    iget v13, v1, Lcom/facebook/react/views/view/g;->recycleCount:I

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v10, 0x0

    .line 78
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v3, "  excludedViews="

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_2
    add-int/lit8 v11, v11, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :catch_0
    move-exception v0

    .line 133
    new-instance v9, Ljava/util/HashSet;

    .line 134
    .line 135
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 136
    .line 137
    .line 138
    const/4 v13, 0x0

    .line 139
    const/4 v14, 0x0

    .line 140
    :goto_2
    if-ge v13, v11, :cond_3

    .line 141
    .line 142
    aget-object v15, v8, v13

    .line 143
    .line 144
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-direct {v1, v15, v10}, Lcom/facebook/react/views/view/g;->u(Landroid/view/View;Ljava/lang/Integer;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    add-int/2addr v14, v10

    .line 153
    aget-object v10, v8, v13

    .line 154
    .line 155
    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    add-int/lit8 v13, v13, 0x1

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    new-instance v8, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    iget v13, v1, Lcom/facebook/react/views/view/g;->allChildrenCount:I

    .line 168
    .line 169
    iget v15, v1, Lcom/facebook/react/views/view/g;->recycleCount:I

    .line 170
    .line 171
    invoke-interface {v9}, Ljava/util/Set;->size()I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v2, :cond_4

    .line 176
    .line 177
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    goto :goto_3

    .line 182
    :cond_4
    const/4 v2, 0x0

    .line 183
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v3, " realClippedSoFar="

    .line 219
    .line 220
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v3, " uniqueViewsCount="

    .line 227
    .line 228
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v3, " excludedViews="

    .line 235
    .line 236
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-direct {v8, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    throw v8

    .line 250
    :cond_5
    const/4 v2, 0x0

    .line 251
    iput-boolean v2, v1, Lcom/facebook/react/views/view/g;->inSubviewClippingLoop:Z

    .line 252
    .line 253
    return-void

    .line 254
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 255
    .line 256
    const-string v2, "Required value was null."

    .line 257
    .line 258
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0
.end method

.method public updateDrawingOrder()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->i()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/p0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
