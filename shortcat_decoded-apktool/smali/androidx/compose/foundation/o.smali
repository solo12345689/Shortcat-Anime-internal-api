.class public final Landroidx/compose/foundation/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/o$c;
    }
.end annotation


# static fields
.field public static final i:Landroidx/compose/foundation/o$c;

.field private static final j:Lh0/v;


# instance fields
.field private final a:LY/A0;

.field private final b:LY/A0;

.field private final c:LB/m;

.field private d:LY/A0;

.field private e:F

.field private final f:Lz/x;

.field private final g:LY/h2;

.field private final h:LY/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/o$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/o$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/o;->i:Landroidx/compose/foundation/o$c;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/foundation/o$a;->a:Landroidx/compose/foundation/o$a;

    .line 10
    .line 11
    sget-object v1, Landroidx/compose/foundation/o$b;->a:Landroidx/compose/foundation/o$b;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh0/y;->e(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/compose/foundation/o;->j:Lh0/v;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LY/J1;->a(I)LY/A0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Landroidx/compose/foundation/o;->a:LY/A0;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, LY/J1;->a(I)LY/A0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/compose/foundation/o;->b:LY/A0;

    .line 16
    .line 17
    invoke-static {}, LB/l;->a()LB/m;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Landroidx/compose/foundation/o;->c:LB/m;

    .line 22
    .line 23
    const p1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, LY/J1;->a(I)LY/A0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Landroidx/compose/foundation/o;->d:LY/A0;

    .line 31
    .line 32
    new-instance p1, Landroidx/compose/foundation/o$f;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Landroidx/compose/foundation/o$f;-><init>(Landroidx/compose/foundation/o;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lz/y;->a(Lkotlin/jvm/functions/Function1;)Lz/x;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Landroidx/compose/foundation/o;->f:Lz/x;

    .line 42
    .line 43
    new-instance p1, Landroidx/compose/foundation/o$e;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Landroidx/compose/foundation/o$e;-><init>(Landroidx/compose/foundation/o;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, LY/U1;->d(Lie/a;)LY/h2;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Landroidx/compose/foundation/o;->g:LY/h2;

    .line 53
    .line 54
    new-instance p1, Landroidx/compose/foundation/o$d;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Landroidx/compose/foundation/o$d;-><init>(Landroidx/compose/foundation/o;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, LY/U1;->d(Lie/a;)LY/h2;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Landroidx/compose/foundation/o;->h:LY/h2;

    .line 64
    .line 65
    return-void
.end method

.method public static final synthetic g(Landroidx/compose/foundation/o;)F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/foundation/o;->e:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic h()Lh0/v;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/o;->j:Lh0/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i(Landroidx/compose/foundation/o;F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/o;->e:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic j(Landroidx/compose/foundation/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/o;->o(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->a:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/A0;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->f:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->f:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lz/x;->b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->h:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->g:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public f(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->f:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz/x;->f(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final k()LB/m;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->c:LB/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->d:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/A0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->a:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/j0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final n(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->d:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/A0;->f(I)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Li0/l$a;->d()Li0/l;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/foundation/o;->m()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-le v4, p1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, p1}, Landroidx/compose/foundation/o;->o(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    invoke-virtual {v0, v1, v3, v2}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_2
    invoke-virtual {v0, v1, v3, v2}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final p(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o;->b:LY/A0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/A0;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
