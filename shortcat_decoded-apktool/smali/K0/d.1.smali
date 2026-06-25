.class public abstract LK0/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LK0/d$a;

.field private static final b:Lkotlin/jvm/functions/Function1;

.field private static final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK0/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK0/d;->a:LK0/d$a;

    .line 7
    .line 8
    sget-object v0, LK0/d$b;->a:LK0/d$b;

    .line 9
    .line 10
    sput-object v0, LK0/d;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    sget-object v0, LK0/d$c;->a:LK0/d$c;

    .line 13
    .line 14
    sput-object v0, LK0/d;->c:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic a()LK0/d$a;
    .locals 1

    .line 1
    sget-object v0, LK0/d;->a:LK0/d$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, LK0/d;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c(LK0/c;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LK0/d;->d(LK0/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final d(LK0/c;)Z
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p0, LK0/E0;

    .line 19
    .line 20
    invoke-virtual {p0}, LK0/E0;->E1()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method
