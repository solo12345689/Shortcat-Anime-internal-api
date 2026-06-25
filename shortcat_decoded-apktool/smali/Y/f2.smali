.class final LY/f2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lk0/k;
.implements Ljava/lang/Iterable;
.implements Lje/a;


# instance fields
.field private final a:LY/E1;

.field private final b:I

.field private final c:LY/h0;

.field private final d:LY/e2;

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(LY/E1;ILY/h0;LY/e2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/f2;->a:LY/E1;

    .line 5
    .line 6
    iput p2, p0, LY/f2;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LY/f2;->c:LY/h0;

    .line 9
    .line 10
    iput-object p4, p0, LY/f2;->d:LY/e2;

    .line 11
    .line 12
    invoke-virtual {p3}, LY/h0;->f()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LY/f2;->e:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p0, p0, LY/f2;->f:Ljava/lang/Iterable;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 5

    .line 1
    new-instance v0, LY/d2;

    .line 2
    .line 3
    iget-object v1, p0, LY/f2;->a:LY/E1;

    .line 4
    .line 5
    iget v2, p0, LY/f2;->b:I

    .line 6
    .line 7
    iget-object v3, p0, LY/f2;->c:LY/h0;

    .line 8
    .line 9
    iget-object v4, p0, LY/f2;->d:LY/e2;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, LY/d2;-><init>(LY/E1;ILY/h0;LY/e2;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
