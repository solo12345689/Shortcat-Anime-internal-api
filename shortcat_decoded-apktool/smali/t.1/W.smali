.class public abstract Lt/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:[Ljava/lang/Object;

.field private static final b:Lt/V;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, Lt/W;->a:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v1, Lt/L;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lt/L;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lt/W;->b:Lt/V;

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic a()[Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lt/W;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()Lt/V;
    .locals 2

    .line 1
    sget-object v0, Lt/W;->b:Lt/V;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final c(Ljava/lang/Object;)Lt/L;
    .locals 2

    .line 1
    new-instance v0, Lt/L;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lt/L;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/Object;)Lt/L;
    .locals 2

    .line 1
    new-instance v0, Lt/L;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lt/L;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
