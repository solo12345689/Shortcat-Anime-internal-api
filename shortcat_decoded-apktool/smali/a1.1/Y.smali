.class public final La1/Y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements La1/M;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La1/Y$a;,
        La1/Y$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/view/View;

.field private final b:La1/v;

.field private final c:Ljava/util/concurrent/Executor;

.field private d:Z

.field private e:Lkotlin/jvm/functions/Function1;

.field private f:Lkotlin/jvm/functions/Function1;

.field private g:La1/U;

.field private h:La1/t;

.field private i:Ljava/util/List;

.field private final j:Lkotlin/Lazy;

.field private k:Landroid/graphics/Rect;

.field private final l:La1/e;

.field private final m:La0/c;

.field private n:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/view/View;LE0/h;)V
    .locals 7

    .line 16
    new-instance v3, La1/w;

    invoke-direct {v3, p1}, La1/w;-><init>(Landroid/view/View;)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, La1/Y;-><init>(Landroid/view/View;LE0/h;La1/v;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LE0/h;La1/v;Ljava/util/concurrent/Executor;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La1/Y;->a:Landroid/view/View;

    .line 3
    iput-object p3, p0, La1/Y;->b:La1/v;

    .line 4
    iput-object p4, p0, La1/Y;->c:Ljava/util/concurrent/Executor;

    .line 5
    sget-object p1, La1/Y$e;->a:La1/Y$e;

    iput-object p1, p0, La1/Y;->e:Lkotlin/jvm/functions/Function1;

    .line 6
    sget-object p1, La1/Y$f;->a:La1/Y$f;

    iput-object p1, p0, La1/Y;->f:Lkotlin/jvm/functions/Function1;

    .line 7
    new-instance v0, La1/U;

    sget-object p1, LU0/W0;->b:LU0/W0$a;

    invoke-virtual {p1}, LU0/W0$a;->a()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, La1/U;-><init>(Ljava/lang/String;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, La1/Y;->g:La1/U;

    .line 8
    sget-object p1, La1/t;->g:La1/t$a;

    invoke-virtual {p1}, La1/t$a;->a()La1/t;

    move-result-object p1

    iput-object p1, p0, La1/Y;->h:La1/t;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La1/Y;->i:Ljava/util/List;

    .line 10
    sget-object p1, LTd/q;->c:LTd/q;

    new-instance p4, La1/Y$c;

    invoke-direct {p4, p0}, La1/Y$c;-><init>(La1/Y;)V

    invoke-static {p1, p4}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, La1/Y;->j:Lkotlin/Lazy;

    .line 11
    new-instance p1, La1/e;

    invoke-direct {p1, p2, p3}, La1/e;-><init>(LE0/h;La1/v;)V

    iput-object p1, p0, La1/Y;->l:La1/e;

    .line 12
    new-instance p1, La0/c;

    const/16 p2, 0x10

    new-array p2, p2, [La1/Y$a;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 13
    iput-object p1, p0, La1/Y;->m:La0/c;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;LE0/h;La1/v;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 14
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p4

    invoke-static {p4}, La1/b0;->d(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;

    move-result-object p4

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, La1/Y;-><init>(Landroid/view/View;LE0/h;La1/v;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic i(La1/Y;)V
    .locals 0

    .line 1
    invoke-static {p0}, La1/Y;->w(La1/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic j(La1/Y;)Landroid/view/inputmethod/BaseInputConnection;
    .locals 0

    .line 1
    invoke-direct {p0}, La1/Y;->p()Landroid/view/inputmethod/BaseInputConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(La1/Y;)La1/e;
    .locals 0

    .line 1
    iget-object p0, p0, La1/Y;->l:La1/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(La1/Y;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La1/Y;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(La1/Y;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, La1/Y;->e:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(La1/Y;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, La1/Y;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method private final p()Landroid/view/inputmethod/BaseInputConnection;
    .locals 1

    .line 1
    iget-object v0, p0, La1/Y;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 8
    .line 9
    return-object v0
.end method

.method private final s()V
    .locals 6

    .line 1
    iget-object v0, p0, La1/Y;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La1/Y;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, La1/Y;->m:La0/c;

    .line 29
    .line 30
    invoke-virtual {v0}, La0/c;->i()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 35
    .line 36
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lkotlin/jvm/internal/N;

    .line 40
    .line 41
    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, La1/Y;->m:La0/c;

    .line 45
    .line 46
    iget-object v3, v2, La0/c;->a:[Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v2}, La0/c;->p()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v4, 0x0

    .line 53
    :goto_0
    if-ge v4, v2, :cond_1

    .line 54
    .line 55
    aget-object v5, v3, v4

    .line 56
    .line 57
    check-cast v5, La1/Y$a;

    .line 58
    .line 59
    invoke-static {v5, v0, v1}, La1/Y;->t(La1/Y$a;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object v2, p0, La1/Y;->m:La0/c;

    .line 66
    .line 67
    invoke-virtual {v2}, La0/c;->i()V

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 71
    .line 72
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-direct {p0}, La1/Y;->u()V

    .line 81
    .line 82
    .line 83
    :cond_2
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/Boolean;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-direct {p0, v1}, La1/Y;->x(Z)V

    .line 94
    .line 95
    .line 96
    :cond_3
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    invoke-direct {p0}, La1/Y;->u()V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void
.end method

.method private static final t(La1/Y$a;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 3

    .line 1
    sget-object v0, La1/Y$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_5

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_4

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, LTd/r;

    .line 23
    .line 24
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1
    :goto_0
    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    sget-object p1, La1/Y$a;->c:La1/Y$a;

    .line 39
    .line 40
    if-ne p0, p1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 v1, 0x0

    .line 44
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 49
    .line 50
    :cond_3
    return-void

    .line 51
    :cond_4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 63
    .line 64
    return-void
.end method

.method private final u()V
    .locals 1

    .line 1
    iget-object v0, p0, La1/Y;->b:La1/v;

    .line 2
    .line 3
    invoke-interface {v0}, La1/v;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final v(La1/Y$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, La1/Y;->m:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La1/Y;->n:Ljava/lang/Runnable;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, La1/X;

    .line 11
    .line 12
    invoke-direct {p1, p0}, La1/X;-><init>(La1/Y;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La1/Y;->c:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La1/Y;->n:Ljava/lang/Runnable;

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private static final w(La1/Y;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La1/Y;->n:Ljava/lang/Runnable;

    .line 3
    .line 4
    invoke-direct {p0}, La1/Y;->s()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final x(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La1/Y;->b:La1/v;

    .line 4
    .line 5
    invoke-interface {p1}, La1/v;->d()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p1, p0, La1/Y;->b:La1/v;

    .line 10
    .line 11
    invoke-interface {p1}, La1/v;->e()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    sget-object v0, La1/Y$a;->a:La1/Y$a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La1/Y;->v(La1/Y$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La1/Y;->d:Z

    .line 3
    .line 4
    sget-object v0, La1/Y$g;->a:La1/Y$g;

    .line 5
    .line 6
    iput-object v0, p0, La1/Y;->e:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    sget-object v0, La1/Y$h;->a:La1/Y$h;

    .line 9
    .line 10
    iput-object v0, p0, La1/Y;->f:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, La1/Y;->k:Landroid/graphics/Rect;

    .line 14
    .line 15
    sget-object v0, La1/Y$a;->b:La1/Y$a;

    .line 16
    .line 17
    invoke-direct {p0, v0}, La1/Y;->v(La1/Y$a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public c(La1/U;La1/J;LU0/T0;Lkotlin/jvm/functions/Function1;Lr0/h;Lr0/h;)V
    .locals 7

    .line 1
    iget-object v0, p0, La1/Y;->l:La1/e;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-virtual/range {v0 .. v6}, La1/e;->d(La1/U;La1/J;LU0/T0;Lkotlin/jvm/functions/Function1;Lr0/h;Lr0/h;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d(Lr0/h;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr0/h;->i()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lke/a;->d(F)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Lr0/h;->l()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Lke/a;->d(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p1}, Lr0/h;->j()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Lke/a;->d(F)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p1}, Lr0/h;->e()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1}, Lke/a;->d(F)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La1/Y;->k:Landroid/graphics/Rect;

    .line 39
    .line 40
    iget-object p1, p0, La1/Y;->i:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p0, La1/Y;->k:Landroid/graphics/Rect;

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    iget-object v0, p0, La1/Y;->a:Landroid/view/View;

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/Rect;

    .line 55
    .line 56
    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    sget-object v0, La1/Y$a;->d:La1/Y$a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La1/Y;->v(La1/Y$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(La1/U;La1/U;)V
    .locals 6

    .line 1
    iget-object v0, p0, La1/Y;->g:La1/U;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/U;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p2}, La1/U;->k()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v0, v1, v2, v3}, LU0/W0;->g(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, La1/Y;->g:La1/U;

    .line 19
    .line 20
    invoke-virtual {v0}, La1/U;->j()LU0/W0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p2}, La1/U;->j()LU0/W0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v0, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 38
    :goto_1
    iput-object p2, p0, La1/Y;->g:La1/U;

    .line 39
    .line 40
    iget-object v2, p0, La1/Y;->i:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    move v3, v1

    .line 47
    :goto_2
    if-ge v3, v2, :cond_3

    .line 48
    .line 49
    iget-object v4, p0, La1/Y;->i:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, La1/N;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v4, p2}, La1/N;->f(La1/U;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    iget-object v2, p0, La1/Y;->l:La1/e;

    .line 72
    .line 73
    invoke-virtual {v2}, La1/e;->a()V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    if-eqz v0, :cond_a

    .line 83
    .line 84
    iget-object p1, p0, La1/Y;->b:La1/v;

    .line 85
    .line 86
    invoke-virtual {p2}, La1/U;->k()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    invoke-static {v0, v1}, LU0/W0;->l(J)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p2}, La1/U;->k()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    invoke-static {v1, v2}, LU0/W0;->k(J)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iget-object v1, p0, La1/Y;->g:La1/U;

    .line 103
    .line 104
    invoke-virtual {v1}, La1/U;->j()LU0/W0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const/4 v2, -0x1

    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    invoke-virtual {v1}, LU0/W0;->r()J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-static {v3, v4}, LU0/W0;->l(J)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move v1, v2

    .line 121
    :goto_3
    iget-object v3, p0, La1/Y;->g:La1/U;

    .line 122
    .line 123
    invoke-virtual {v3}, La1/U;->j()LU0/W0;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    if-eqz v3, :cond_5

    .line 128
    .line 129
    invoke-virtual {v3}, LU0/W0;->r()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    invoke-static {v2, v3}, LU0/W0;->k(J)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    :cond_5
    invoke-interface {p1, v0, p2, v1, v2}, La1/v;->a(IIII)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_6
    if-eqz p1, :cond_8

    .line 142
    .line 143
    invoke-virtual {p1}, La1/U;->l()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p2}, La1/U;->l()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    invoke-virtual {p1}, La1/U;->k()J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    invoke-virtual {p2}, La1/U;->k()J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    invoke-static {v2, v3, v4, v5}, LU0/W0;->g(JJ)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    invoke-virtual {p1}, La1/U;->j()LU0/W0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p2}, La1/U;->j()LU0/W0;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-nez p1, :cond_8

    .line 184
    .line 185
    :cond_7
    invoke-direct {p0}, La1/Y;->u()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_8
    iget-object p1, p0, La1/Y;->i:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    :goto_4
    if-ge v1, p1, :cond_a

    .line 196
    .line 197
    iget-object p2, p0, La1/Y;->i:Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    check-cast p2, La1/N;

    .line 210
    .line 211
    if-eqz p2, :cond_9

    .line 212
    .line 213
    iget-object v0, p0, La1/Y;->g:La1/U;

    .line 214
    .line 215
    iget-object v2, p0, La1/Y;->b:La1/v;

    .line 216
    .line 217
    invoke-virtual {p2, v0, v2}, La1/N;->g(La1/U;La1/v;)V

    .line 218
    .line 219
    .line 220
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_a
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    sget-object v0, La1/Y$a;->c:La1/Y$a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La1/Y;->v(La1/Y$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(La1/U;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La1/Y;->d:Z

    .line 3
    .line 4
    iput-object p1, p0, La1/Y;->g:La1/U;

    .line 5
    .line 6
    iput-object p2, p0, La1/Y;->h:La1/t;

    .line 7
    .line 8
    iput-object p3, p0, La1/Y;->e:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iput-object p4, p0, La1/Y;->f:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    sget-object p1, La1/Y$a;->a:La1/Y$a;

    .line 13
    .line 14
    invoke-direct {p0, p1}, La1/Y;->v(La1/Y$a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .line 1
    iget-boolean v0, p0, La1/Y;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    iget-object v0, p0, La1/Y;->h:La1/t;

    .line 8
    .line 9
    iget-object v1, p0, La1/Y;->g:La1/U;

    .line 10
    .line 11
    invoke-static {p1, v0, v1}, La1/b0;->h(Landroid/view/inputmethod/EditorInfo;La1/t;La1/U;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La1/b0;->c(Landroid/view/inputmethod/EditorInfo;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La1/Y;->g:La1/U;

    .line 18
    .line 19
    iget-object v0, p0, La1/Y;->h:La1/t;

    .line 20
    .line 21
    invoke-virtual {v0}, La1/t;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    new-instance v1, La1/Y$d;

    .line 26
    .line 27
    invoke-direct {v1, p0}, La1/Y$d;-><init>(La1/Y;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, La1/N;

    .line 31
    .line 32
    invoke-direct {v2, p1, v1, v0}, La1/N;-><init>(La1/U;La1/u;Z)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, La1/Y;->i:Ljava/util/List;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-object v2
.end method

.method public final q()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, La1/Y;->a:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La1/Y;->d:Z

    .line 2
    .line 3
    return v0
.end method
