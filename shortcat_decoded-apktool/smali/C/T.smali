.class public abstract LC/T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LJ0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LC/T$a;->a:LC/T$a;

    .line 2
    .line 3
    invoke-static {v0}, LJ0/e;->a(Lie/a;)LJ0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LC/T;->a:LJ0/l;

    .line 8
    .line 9
    return-void
.end method

.method public static final a()LJ0/l;
    .locals 1

    .line 1
    sget-object v0, LC/T;->a:LJ0/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LC/T$b;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LC/T$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    new-instance v1, LC/T$c;

    .line 18
    .line 19
    invoke-direct {v1, p1}, LC/T$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;)Landroidx/compose/ui/e;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LC/T$d;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LC/T$d;-><init>(LC/P;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    new-instance v1, LC/T$e;

    .line 18
    .line 19
    invoke-direct {v1, p1}, LC/T$e;-><init>(LC/P;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;)Landroidx/compose/ui/e;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
