.class public abstract Lx/S;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lx/S$a;->a:Lx/S$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v2, v0, v1, v2}, LY/H;->h(LY/T1;Lie/a;ILjava/lang/Object;)LY/b1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lx/S;->a:LY/b1;

    .line 10
    .line 11
    return-void
.end method

.method public static final a()LY/b1;
    .locals 1

    .line 1
    sget-object v0, Lx/S;->a:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method
