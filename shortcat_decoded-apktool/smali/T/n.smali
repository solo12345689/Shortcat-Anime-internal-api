.class public abstract LT/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;

.field private static final b:LT/d;

.field private static final c:LT/d;

.field private static final d:LT/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, LT/n$a;->a:LT/n$a;

    .line 2
    .line 3
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LT/n;->a:LY/b1;

    .line 8
    .line 9
    new-instance v0, LT/d;

    .line 10
    .line 11
    const v1, 0x3e23d70a    # 0.16f

    .line 12
    .line 13
    .line 14
    const v2, 0x3e75c28f    # 0.24f

    .line 15
    .line 16
    .line 17
    const v3, 0x3da3d70a    # 0.08f

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3, v2}, LT/d;-><init>(FFFF)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LT/n;->b:LT/d;

    .line 24
    .line 25
    new-instance v0, LT/d;

    .line 26
    .line 27
    const v1, 0x3df5c28f    # 0.12f

    .line 28
    .line 29
    .line 30
    const v2, 0x3d23d70a    # 0.04f

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v3, v1, v2, v1}, LT/d;-><init>(FFFF)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LT/n;->c:LT/d;

    .line 37
    .line 38
    new-instance v0, LT/d;

    .line 39
    .line 40
    const v4, 0x3dcccccd    # 0.1f

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v3, v1, v2, v4}, LT/d;-><init>(FFFF)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LT/n;->d:LT/d;

    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic a()LT/d;
    .locals 1

    .line 1
    sget-object v0, LT/n;->d:LT/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()LT/d;
    .locals 1

    .line 1
    sget-object v0, LT/n;->b:LT/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()LT/d;
    .locals 1

    .line 1
    sget-object v0, LT/n;->c:LT/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d()LY/b1;
    .locals 1

    .line 1
    sget-object v0, LT/n;->a:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method
