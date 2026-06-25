.class public Lx6/n$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LC5/a;

.field public c:I

.field public d:Z

.field public final e:Lx6/n$b;

.field public f:I

.field public g:I


# direct methods
.method private constructor <init>(Ljava/lang/Object;LC5/a;Lx6/n$b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lx6/n$a;->a:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p2}, LC5/a;->j(LC5/a;)LC5/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LC5/a;

    .line 19
    .line 20
    iput-object p1, p0, Lx6/n$a;->b:LC5/a;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Lx6/n$a;->c:I

    .line 24
    .line 25
    iput-boolean p1, p0, Lx6/n$a;->d:Z

    .line 26
    .line 27
    iput-object p3, p0, Lx6/n$a;->e:Lx6/n$b;

    .line 28
    .line 29
    iput p1, p0, Lx6/n$a;->f:I

    .line 30
    .line 31
    iput p4, p0, Lx6/n$a;->g:I

    .line 32
    .line 33
    return-void
.end method

.method public static a(Ljava/lang/Object;LC5/a;ILx6/n$b;)Lx6/n$a;
    .locals 1

    .line 1
    new-instance v0, Lx6/n$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p3, p2}, Lx6/n$a;-><init>(Ljava/lang/Object;LC5/a;Lx6/n$b;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b(Ljava/lang/Object;LC5/a;Lx6/n$b;)Lx6/n$a;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {p0, p1, v0, p2}, Lx6/n$a;->a(Ljava/lang/Object;LC5/a;ILx6/n$b;)Lx6/n$a;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
