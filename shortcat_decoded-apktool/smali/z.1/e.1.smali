.class public abstract Lz/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;

.field private static final b:Lz/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lz/e$a;->a:Lz/e$a;

    .line 2
    .line 3
    invoke-static {v0}, LY/H;->i(Lkotlin/jvm/functions/Function1;)LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lz/e;->a:LY/b1;

    .line 8
    .line 9
    new-instance v0, Lz/e$b;

    .line 10
    .line 11
    invoke-direct {v0}, Lz/e$b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz/e;->b:Lz/d;

    .line 15
    .line 16
    return-void
.end method

.method public static final a()LY/b1;
    .locals 1

    .line 1
    sget-object v0, Lz/e;->a:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()Lz/d;
    .locals 1

    .line 1
    sget-object v0, Lz/e;->b:Lz/d;

    .line 2
    .line 3
    return-object v0
.end method
