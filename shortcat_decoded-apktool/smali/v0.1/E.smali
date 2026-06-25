.class public final Lv0/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lv0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/E$b;
    }
.end annotation


# static fields
.field public static final L:Lv0/E$b;

.field private static final M:Z

.field private static final N:Landroid/graphics/Canvas;


# instance fields
.field private A:F

.field private B:F

.field private C:F

.field private D:F

.field private E:J

.field private F:J

.field private G:F

.field private H:F

.field private I:F

.field private J:Ls0/u1;

.field private final K:Z

.field private final b:Landroidx/compose/ui/graphics/layer/view/a;

.field private final c:J

.field private final d:Ls0/k0;

.field private final e:Lv0/S;

.field private final f:Landroid/content/res/Resources;

.field private final g:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Paint;

.field private final i:Landroid/graphics/Picture;

.field private final j:Lu0/a;

.field private final k:Ls0/k0;

.field private l:I

.field private m:I

.field private n:J

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private final s:J

.field private t:I

.field private u:Landroidx/compose/ui/graphics/d;

.field private v:I

.field private w:F

.field private x:Z

.field private y:J

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv0/E$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lv0/E$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv0/E;->L:Lv0/E$b;

    .line 8
    .line 9
    sget-object v0, Lv0/Q;->a:Lv0/Q;

    .line 10
    .line 11
    invoke-virtual {v0}, Lv0/Q;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    sput-boolean v0, Lv0/E;->M:Z

    .line 18
    .line 19
    new-instance v0, Lv0/E$a;

    .line 20
    .line 21
    invoke-direct {v0}, Lv0/E$a;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lv0/E;->N:Landroid/graphics/Canvas;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/graphics/layer/view/a;JLs0/k0;Lu0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv0/E;->b:Landroidx/compose/ui/graphics/layer/view/a;

    .line 3
    iput-wide p2, p0, Lv0/E;->c:J

    .line 4
    iput-object p4, p0, Lv0/E;->d:Ls0/k0;

    .line 5
    new-instance p2, Lv0/S;

    invoke-direct {p2, p1, p4, p5}, Lv0/S;-><init>(Landroid/view/View;Ls0/k0;Lu0/a;)V

    iput-object p2, p0, Lv0/E;->e:Lv0/S;

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    iput-object p3, p0, Lv0/E;->f:Landroid/content/res/Resources;

    .line 7
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lv0/E;->g:Landroid/graphics/Rect;

    .line 8
    sget-boolean p3, Lv0/E;->M:Z

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    .line 9
    new-instance p5, Landroid/graphics/Picture;

    invoke-direct {p5}, Landroid/graphics/Picture;-><init>()V

    goto :goto_0

    :cond_0
    move-object p5, p4

    .line 10
    :goto_0
    iput-object p5, p0, Lv0/E;->i:Landroid/graphics/Picture;

    if-eqz p3, :cond_1

    .line 11
    new-instance p5, Lu0/a;

    invoke-direct {p5}, Lu0/a;-><init>()V

    goto :goto_1

    :cond_1
    move-object p5, p4

    .line 12
    :goto_1
    iput-object p5, p0, Lv0/E;->j:Lu0/a;

    if-eqz p3, :cond_2

    .line 13
    new-instance p5, Ls0/k0;

    invoke-direct {p5}, Ls0/k0;-><init>()V

    goto :goto_2

    :cond_2
    move-object p5, p4

    .line 14
    :goto_2
    iput-object p5, p0, Lv0/E;->k:Ls0/k0;

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    invoke-virtual {p2, p4}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 17
    sget-object p1, Li1/r;->b:Li1/r$a;

    invoke-virtual {p1}, Li1/r$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lv0/E;->n:J

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lv0/E;->p:Z

    .line 19
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lv0/E;->s:J

    .line 20
    sget-object p1, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/c$a;->B()I

    move-result p1

    iput p1, p0, Lv0/E;->t:I

    .line 21
    sget-object p1, Lv0/b;->a:Lv0/b$a;

    invoke-virtual {p1}, Lv0/b$a;->a()I

    move-result p1

    iput p1, p0, Lv0/E;->v:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    iput p1, p0, Lv0/E;->w:F

    .line 23
    sget-object p2, Lr0/f;->b:Lr0/f$a;

    invoke-virtual {p2}, Lr0/f$a;->c()J

    move-result-wide p4

    iput-wide p4, p0, Lv0/E;->y:J

    .line 24
    iput p1, p0, Lv0/E;->z:F

    .line 25
    iput p1, p0, Lv0/E;->A:F

    .line 26
    sget-object p1, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {p1}, Ls0/r0$a;->a()J

    move-result-wide p4

    iput-wide p4, p0, Lv0/E;->E:J

    .line 27
    invoke-virtual {p1}, Ls0/r0$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lv0/E;->F:J

    .line 28
    iput-boolean p3, p0, Lv0/E;->K:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/graphics/layer/view/a;JLs0/k0;Lu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 29
    new-instance p4, Ls0/k0;

    invoke-direct {p4}, Ls0/k0;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    .line 30
    new-instance p5, Lu0/a;

    invoke-direct {p5}, Lu0/a;-><init>()V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p5

    .line 31
    invoke-direct/range {v0 .. v5}, Lv0/E;-><init>(Landroidx/compose/ui/graphics/layer/view/a;JLs0/k0;Lu0/a;)V

    return-void
.end method

.method private final R(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 2
    .line 3
    sget-object v1, Lv0/b;->a:Lv0/b$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lv0/b$a;->c()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {p1, v2}, Lv0/b;->e(II)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lv0/E;->e:Lv0/S;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    iget-object v2, p0, Lv0/E;->h:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Lv0/b$a;->b()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p1, v1}, Lv0/b;->e(II)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lv0/E;->e:Lv0/S;

    .line 37
    .line 38
    iget-object v2, p0, Lv0/E;->h:Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    move v3, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object p1, p0, Lv0/E;->e:Lv0/S;

    .line 46
    .line 47
    iget-object v2, p0, Lv0/E;->h:Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, v3}, Lv0/S;->setCanUseCompositingLayer$ui_graphics_release(Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private final T()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/E;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lv0/E;->h:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method private final U()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lv0/E;->d:Ls0/k0;

    .line 2
    .line 3
    sget-object v1, Lv0/E;->N:Landroid/graphics/Canvas;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls0/k0;->a()Ls0/D;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ls0/D;->a()Landroid/graphics/Canvas;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Ls0/k0;->a()Ls0/D;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3, v1}, Ls0/D;->y(Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ls0/k0;->a()Ls0/D;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v3, p0, Lv0/E;->b:Landroidx/compose/ui/graphics/layer/view/a;

    .line 25
    .line 26
    iget-object v4, p0, Lv0/E;->e:Lv0/S;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroid/view/View;->getDrawingTime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    invoke-virtual {v3, v1, v4, v5, v6}, Landroidx/compose/ui/graphics/layer/view/a;->a(Ls0/j0;Landroid/view/View;J)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ls0/k0;->a()Ls0/D;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v2}, Ls0/D;->y(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    :catch_0
    return-void
.end method

.method private final V()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv0/E;->q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lv0/b;->a:Lv0/b$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lv0/b$a;->c()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Lv0/b;->e(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0}, Lv0/E;->W()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method private final W()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv0/E;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/c$a;->B()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lv0/E;->f()Landroidx/compose/ui/graphics/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method private final X()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lv0/E;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 6
    .line 7
    invoke-virtual {p0}, Lv0/E;->S()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, Lv0/E;->q:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lv0/E;->g:Landroid/graphics/Rect;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput v2, v1, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iget-object v2, p0, Lv0/E;->e:Lv0/S;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iput v2, v1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    iget-object v2, p0, Lv0/E;->e:Lv0/S;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method private final Y()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lv0/E;->V()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lv0/b;->a:Lv0/b$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lv0/b$a;->c()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-direct {p0, v0}, Lv0/E;->R(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, Lv0/E;->q()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {p0, v0}, Lv0/E;->R(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public A()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv0/E;->E:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public B(Li1/d;Li1/t;Lv0/c;Lkotlin/jvm/functions/Function1;)V
    .locals 18

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v1, Lv0/E;->e:Lv0/S;

    .line 12
    .line 13
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    iget-object v5, v1, Lv0/E;->b:Landroidx/compose/ui/graphics/layer/view/a;

    .line 20
    .line 21
    iget-object v6, v1, Lv0/E;->e:Lv0/S;

    .line 22
    .line 23
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v5, v1, Lv0/E;->e:Lv0/S;

    .line 27
    .line 28
    invoke-virtual {v5, v0, v2, v3, v4}, Lv0/S;->b(Li1/d;Li1/t;Lv0/c;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    iget-object v5, v1, Lv0/E;->e:Lv0/S;

    .line 32
    .line 33
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    iget-object v5, v1, Lv0/E;->e:Lv0/S;

    .line 40
    .line 41
    const/4 v6, 0x4

    .line 42
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v5, v1, Lv0/E;->e:Lv0/S;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v1}, Lv0/E;->U()V

    .line 52
    .line 53
    .line 54
    iget-object v5, v1, Lv0/E;->i:Landroid/graphics/Picture;

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    iget-wide v6, v1, Lv0/E;->n:J

    .line 59
    .line 60
    const/16 v8, 0x20

    .line 61
    .line 62
    shr-long v8, v6, v8

    .line 63
    .line 64
    long-to-int v8, v8

    .line 65
    const-wide v9, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v6, v9

    .line 71
    long-to-int v6, v6

    .line 72
    invoke-virtual {v5, v8, v6}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :try_start_0
    iget-object v7, v1, Lv0/E;->k:Ls0/k0;

    .line 77
    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    invoke-virtual {v7}, Ls0/k0;->a()Ls0/D;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v8}, Ls0/D;->a()Landroid/graphics/Canvas;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v7}, Ls0/k0;->a()Ls0/D;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {v9, v6}, Ls0/D;->y(Landroid/graphics/Canvas;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Ls0/k0;->a()Ls0/D;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iget-object v9, v1, Lv0/E;->j:Lu0/a;

    .line 100
    .line 101
    if-eqz v9, :cond_1

    .line 102
    .line 103
    iget-wide v10, v1, Lv0/E;->n:J

    .line 104
    .line 105
    invoke-static {v10, v11}, Li1/s;->d(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v10

    .line 109
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    invoke-interface {v12}, Lu0/d;->getDensity()Li1/d;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    invoke-interface {v13}, Lu0/d;->getLayoutDirection()Li1/t;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    invoke-interface {v14}, Lu0/d;->b()Ls0/j0;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    move-object/from16 v16, v7

    .line 138
    .line 139
    move-object/from16 v17, v8

    .line 140
    .line 141
    invoke-interface {v15}, Lu0/d;->f()J

    .line 142
    .line 143
    .line 144
    move-result-wide v7

    .line 145
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    invoke-interface {v15}, Lu0/d;->g()Lv0/c;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v1, v0}, Lu0/d;->c(Li1/d;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, v2}, Lu0/d;->d(Li1/t;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v1, v6}, Lu0/d;->h(Ls0/j0;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1, v10, v11}, Lu0/d;->e(J)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v1, v3}, Lu0/d;->i(Lv0/c;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v6}, Ls0/j0;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    .line 174
    .line 175
    :try_start_1
    invoke-interface {v4, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 176
    .line 177
    .line 178
    :try_start_2
    invoke-interface {v6}, Ls0/j0;->k()V

    .line 179
    .line 180
    .line 181
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0, v12}, Lu0/d;->c(Li1/d;)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0, v13}, Lu0/d;->d(Li1/t;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0, v14}, Lu0/d;->h(Ls0/j0;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v7, v8}, Lu0/d;->e(J)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v0, v15}, Lu0/d;->i(Lv0/c;)V

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    goto :goto_1

    .line 203
    :catchall_1
    move-exception v0

    .line 204
    invoke-interface {v6}, Ls0/j0;->k()V

    .line 205
    .line 206
    .line 207
    invoke-interface {v9}, Lu0/f;->n1()Lu0/d;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-interface {v1, v12}, Lu0/d;->c(Li1/d;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v1, v13}, Lu0/d;->d(Li1/t;)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v1, v14}, Lu0/d;->h(Ls0/j0;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v1, v7, v8}, Lu0/d;->e(J)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v1, v15}, Lu0/d;->i(Lv0/c;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :cond_1
    move-object/from16 v16, v7

    .line 228
    .line 229
    move-object/from16 v17, v8

    .line 230
    .line 231
    :goto_0
    invoke-virtual/range {v16 .. v16}, Ls0/k0;->a()Ls0/D;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    move-object/from16 v1, v17

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ls0/D;->y(Landroid/graphics/Canvas;)V

    .line 238
    .line 239
    .line 240
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    .line 242
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/Picture;->endRecording()V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :goto_1
    invoke-virtual {v5}, Landroid/graphics/Picture;->endRecording()V

    .line 247
    .line 248
    .line 249
    throw v0

    .line 250
    :cond_3
    return-void
.end method

.method public C()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->C:F

    .line 2
    .line 3
    return v0
.end method

.method public D()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->B:F

    .line 2
    .line 3
    return v0
.end method

.method public E()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->G:F

    .line 2
    .line 3
    return v0
.end method

.method public F(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->B:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public G(Ls0/u1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lv0/E;->J:Ls0/u1;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lv0/Y;->a:Lv0/Y;

    .line 10
    .line 11
    iget-object v1, p0, Lv0/E;->e:Lv0/S;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lv0/Y;->a(Landroid/view/View;Ls0/u1;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public H()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->A:F

    .line 2
    .line 3
    return v0
.end method

.method public I()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv0/E;->F:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public J()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public K(Ls0/j0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lv0/E;->X()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ls0/E;->d(Ls0/j0;)Landroid/graphics/Canvas;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lv0/E;->b:Landroidx/compose/ui/graphics/layer/view/a;

    .line 15
    .line 16
    iget-object v1, p0, Lv0/E;->e:Lv0/S;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual {v0, p1, v1, v2, v3}, Landroidx/compose/ui/graphics/layer/view/a;->a(Ls0/j0;Landroid/view/View;J)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Lv0/E;->i:Landroid/graphics/Picture;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public L()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv0/E;->K:Z

    .line 2
    .line 3
    return v0
.end method

.method public M(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv0/E;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public N(Landroid/graphics/Outline;J)V
    .locals 2

    .line 1
    iget-object p2, p0, Lv0/E;->e:Lv0/S;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lv0/S;->c(Landroid/graphics/Outline;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0}, Lv0/E;->S()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p3, p0, Lv0/E;->e:Lv0/S;

    .line 18
    .line 19
    invoke-virtual {p3, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 20
    .line 21
    .line 22
    iget-boolean p3, p0, Lv0/E;->r:Z

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    iput-boolean v0, p0, Lv0/E;->r:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lv0/E;->o:Z

    .line 29
    .line 30
    :cond_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    move v0, v1

    .line 33
    :cond_1
    iput-boolean v0, p0, Lv0/E;->q:Z

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lv0/E;->e:Lv0/S;

    .line 38
    .line 39
    invoke-virtual {p1}, Lv0/S;->invalidate()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lv0/E;->U()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public O(J)V
    .locals 6

    .line 1
    iput-wide p1, p0, Lv0/E;->y:J

    .line 2
    .line 3
    const-wide v0, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v0, p1

    .line 9
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    const-wide v1, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/16 v3, 0x20

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 p2, 0x1c

    .line 28
    .line 29
    if-lt p1, p2, :cond_0

    .line 30
    .line 31
    sget-object p1, Lv0/W;->a:Lv0/W;

    .line 32
    .line 33
    iget-object p2, p0, Lv0/E;->e:Lv0/S;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lv0/W;->a(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lv0/E;->x:Z

    .line 41
    .line 42
    iget-object p1, p0, Lv0/E;->e:Lv0/S;

    .line 43
    .line 44
    iget-wide v4, p0, Lv0/E;->n:J

    .line 45
    .line 46
    shr-long v3, v4, v3

    .line 47
    .line 48
    long-to-int p2, v3

    .line 49
    int-to-float p2, p2

    .line 50
    const/high16 v0, 0x40000000    # 2.0f

    .line 51
    .line 52
    div-float/2addr p2, v0

    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->setPivotX(F)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lv0/E;->e:Lv0/S;

    .line 57
    .line 58
    iget-wide v3, p0, Lv0/E;->n:J

    .line 59
    .line 60
    and-long/2addr v1, v3

    .line 61
    long-to-int p2, v1

    .line 62
    int-to-float p2, p2

    .line 63
    div-float/2addr p2, v0

    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->setPivotY(F)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    const/4 v0, 0x0

    .line 69
    iput-boolean v0, p0, Lv0/E;->x:Z

    .line 70
    .line 71
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 72
    .line 73
    shr-long v3, p1, v3

    .line 74
    .line 75
    long-to-int v3, v3

    .line 76
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {v0, v3}, Landroid/view/View;->setPivotX(F)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 84
    .line 85
    and-long/2addr p1, v1

    .line 86
    long-to-int p1, p1

    .line 87
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {v0, p1}, Landroid/view/View;->setPivotY(F)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public P(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv0/E;->v:I

    .line 2
    .line 3
    invoke-direct {p0}, Lv0/E;->Y()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public Q()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->D:F

    .line 2
    .line 3
    return v0
.end method

.method public S()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv0/E;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getClipToOutline()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public a()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->w:F

    .line 2
    .line 3
    return v0
.end method

.method public b()Ls0/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/E;->J:Ls0/u1;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(I)V
    .locals 2

    .line 1
    iput p1, p0, Lv0/E;->t:I

    .line 2
    .line 3
    invoke-direct {p0}, Lv0/E;->T()Landroid/graphics/Paint;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/ui/graphics/a;->b(I)Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lv0/E;->Y()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public d(Landroidx/compose/ui/graphics/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lv0/E;->u:Landroidx/compose/ui/graphics/d;

    .line 2
    .line 3
    invoke-direct {p0}, Lv0/E;->T()Landroid/graphics/Paint;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ls0/F;->b(Landroidx/compose/ui/graphics/d;)Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lv0/E;->Y()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public e(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->w:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f()Landroidx/compose/ui/graphics/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/E;->u:Landroidx/compose/ui/graphics/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->C:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->H:F

    .line 2
    .line 3
    return v0
.end method

.method public i()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->I:F

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public k(J)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lv0/E;->E:J

    .line 8
    .line 9
    sget-object v0, Lv0/W;->a:Lv0/W;

    .line 10
    .line 11
    iget-object v1, p0, Lv0/E;->e:Lv0/S;

    .line 12
    .line 13
    invoke-static {p1, p2}, Ls0/s0;->k(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, v1, p1}, Lv0/W;->b(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public l(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->z:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m()F
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getCameraDistance()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lv0/E;->f:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 14
    .line 15
    int-to-float v1, v1

    .line 16
    div-float/2addr v0, v1

    .line 17
    return v0
.end method

.method public n(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean v2, p0, Lv0/E;->q:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v0

    .line 12
    :goto_0
    iput-boolean v2, p0, Lv0/E;->r:Z

    .line 13
    .line 14
    iput-boolean v1, p0, Lv0/E;->o:Z

    .line 15
    .line 16
    iget-object v2, p0, Lv0/E;->e:Lv0/S;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-boolean p1, p0, Lv0/E;->q:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public o(J)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lv0/E;->F:J

    .line 8
    .line 9
    sget-object v0, Lv0/W;->a:Lv0/W;

    .line 10
    .line 11
    iget-object v1, p0, Lv0/E;->e:Lv0/S;

    .line 12
    .line 13
    invoke-static {p1, p2}, Ls0/s0;->k(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, v1, p1}, Lv0/W;->c(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/E;->b:Landroidx/compose/ui/graphics/layer/view/a;

    .line 2
    .line 3
    iget-object v1, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q()I
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public r(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 2
    .line 3
    iget-object v1, p0, Lv0/E;->f:Landroid/content/res/Resources;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    mul-float/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setCameraDistance(F)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public s(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->G:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->H:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationY(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public u()F
    .locals 1

    .line 1
    iget v0, p0, Lv0/E;->z:F

    .line 2
    .line 3
    return v0
.end method

.method public v(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->D:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->I:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public x(IIJ)V
    .locals 5

    .line 1
    iget-wide v0, p0, Lv0/E;->n:J

    .line 2
    .line 3
    invoke-static {v0, v1, p3, p4}, Li1/r;->e(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lv0/E;->S()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lv0/E;->o:Z

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 19
    .line 20
    const/16 v1, 0x20

    .line 21
    .line 22
    shr-long v1, p3, v1

    .line 23
    .line 24
    long-to-int v1, v1

    .line 25
    add-int v2, p1, v1

    .line 26
    .line 27
    const-wide v3, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v3, p3

    .line 33
    long-to-int v3, v3

    .line 34
    add-int v4, p2, v3

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2, v2, v4}, Landroid/view/View;->layout(IIII)V

    .line 37
    .line 38
    .line 39
    iput-wide p3, p0, Lv0/E;->n:J

    .line 40
    .line 41
    iget-boolean p3, p0, Lv0/E;->x:Z

    .line 42
    .line 43
    if-eqz p3, :cond_3

    .line 44
    .line 45
    iget-object p3, p0, Lv0/E;->e:Lv0/S;

    .line 46
    .line 47
    int-to-float p4, v1

    .line 48
    const/high16 v0, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr p4, v0

    .line 51
    invoke-virtual {p3, p4}, Landroid/view/View;->setPivotX(F)V

    .line 52
    .line 53
    .line 54
    iget-object p3, p0, Lv0/E;->e:Lv0/S;

    .line 55
    .line 56
    int-to-float p4, v3

    .line 57
    div-float/2addr p4, v0

    .line 58
    invoke-virtual {p3, p4}, Landroid/view/View;->setPivotY(F)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget p3, p0, Lv0/E;->l:I

    .line 63
    .line 64
    if-eq p3, p1, :cond_2

    .line 65
    .line 66
    iget-object p4, p0, Lv0/E;->e:Lv0/S;

    .line 67
    .line 68
    sub-int p3, p1, p3

    .line 69
    .line 70
    invoke-virtual {p4, p3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget p3, p0, Lv0/E;->m:I

    .line 74
    .line 75
    if-eq p3, p2, :cond_3

    .line 76
    .line 77
    iget-object p4, p0, Lv0/E;->e:Lv0/S;

    .line 78
    .line 79
    sub-int p3, p2, p3

    .line 80
    .line 81
    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_0
    iput p1, p0, Lv0/E;->l:I

    .line 85
    .line 86
    iput p2, p0, Lv0/E;->m:I

    .line 87
    .line 88
    return-void
.end method

.method public y(F)V
    .locals 1

    .line 1
    iput p1, p0, Lv0/E;->A:F

    .line 2
    .line 3
    iget-object v0, p0, Lv0/E;->e:Lv0/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
