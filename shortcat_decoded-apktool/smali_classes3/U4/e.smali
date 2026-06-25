.class LU4/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LW4/a$b;


# instance fields
.field private final a:LS4/d;

.field private final b:Ljava/lang/Object;

.field private final c:LS4/h;


# direct methods
.method constructor <init>(LS4/d;Ljava/lang/Object;LS4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU4/e;->a:LS4/d;

    .line 5
    .line 6
    iput-object p2, p0, LU4/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, LU4/e;->c:LS4/h;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LU4/e;->a:LS4/d;

    .line 2
    .line 3
    iget-object v1, p0, LU4/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LU4/e;->c:LS4/h;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1, v2}, LS4/d;->b(Ljava/lang/Object;Ljava/io/File;LS4/h;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
