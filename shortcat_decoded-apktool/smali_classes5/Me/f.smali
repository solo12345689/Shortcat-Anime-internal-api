.class public abstract LMe/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LXe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LXe/c;

    .line 2
    .line 3
    const-string v1, "java.lang.Class"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LMe/f;->a:LXe/c;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic a()LXe/c;
    .locals 1

    .line 1
    sget-object v0, LMe/f;->a:LXe/c;

    .line 2
    .line 3
    return-object v0
.end method
