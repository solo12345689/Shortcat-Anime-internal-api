.class final Lt/a$b;
.super Lt/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lt/a;


# direct methods
.method constructor <init>(Lt/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/a$b;->d:Lt/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lt/i0;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lt/i;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt/a$b;->d:Lt/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/i0;->g(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/a$b;->d:Lt/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/i0;->i(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
