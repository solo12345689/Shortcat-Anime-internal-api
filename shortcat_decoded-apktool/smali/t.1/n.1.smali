.class public abstract Lt/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lt/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lt/E;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt/n;->a:Lt/m;

    .line 8
    .line 9
    return-void
.end method

.method public static final varargs a([I)Lt/m;
    .locals 2

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lt/E;

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    invoke-direct {v0, v1}, Lt/E;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget v1, v0, Lt/m;->b:I

    .line 13
    .line 14
    invoke-virtual {v0, v1, p0}, Lt/E;->i(I[I)Z

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final b(I)Lt/E;
    .locals 2

    .line 1
    new-instance v0, Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lt/E;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lt/E;->h(I)Z

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
