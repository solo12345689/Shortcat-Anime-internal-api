.class public abstract LU/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;

.field private static final b:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LU/C$a;->a:LU/C$a;

    .line 2
    .line 3
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LU/C;->a:LY/b1;

    .line 8
    .line 9
    sget-object v0, LU/C$b;->a:LU/C$b;

    .line 10
    .line 11
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LU/C;->b:LY/b1;

    .line 16
    .line 17
    return-void
.end method

.method public static final a()LY/b1;
    .locals 1

    .line 1
    sget-object v0, LU/C;->b:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/MinimumInteractiveModifier;->b:Landroidx/compose/material3/MinimumInteractiveModifier;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
