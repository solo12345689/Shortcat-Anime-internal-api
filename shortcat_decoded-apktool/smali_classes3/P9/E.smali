.class public abstract LP9/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/E$e;,
        LP9/E$d;,
        LP9/E$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LP9/E$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/E;-><init>()V

    return-void
.end method

.method public static a()LP9/E$e;
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {v0}, LP9/E;->b(I)LP9/E$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static b(I)LP9/E$e;
    .locals 1

    .line 1
    const-string v0, "expectedKeys"

    .line 2
    .line 3
    invoke-static {p0, v0}, LP9/h;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    new-instance v0, LP9/E$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LP9/E$a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static c()LP9/E$e;
    .locals 1

    .line 1
    invoke-static {}, LP9/K;->c()LP9/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LP9/E;->d(Ljava/util/Comparator;)LP9/E$e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static d(Ljava/util/Comparator;)LP9/E$e;
    .locals 1

    .line 1
    invoke-static {p0}, LO9/n;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, LP9/E$b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LP9/E$b;-><init>(Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
