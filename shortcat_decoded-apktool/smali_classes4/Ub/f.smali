.class public abstract LUb/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lub/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lub/d;

    .line 2
    .line 3
    sget-object v1, Lub/b;->a:Lub/b;

    .line 4
    .line 5
    const-string v2, "ExpoModulesCore"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lub/b;->a(Ljava/lang/String;)Lub/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lub/d;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LUb/f;->a:Lub/d;

    .line 19
    .line 20
    return-void
.end method

.method public static final a()Lub/d;
    .locals 1

    .line 1
    sget-object v0, LUb/f;->a:Lub/d;

    .line 2
    .line 3
    return-object v0
.end method
