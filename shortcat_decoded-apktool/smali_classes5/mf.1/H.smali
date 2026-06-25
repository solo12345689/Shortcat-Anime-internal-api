.class Lmf/H;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lmf/K;

.field private final b:Lmf/N;

.field private final c:LZe/p;

.field private final d:Lmf/d;

.field private final e:I

.field private final f:LSe/v;


# direct methods
.method public constructor <init>(Lmf/K;Lmf/N;LZe/p;Lmf/d;ILSe/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmf/H;->a:Lmf/K;

    .line 5
    .line 6
    iput-object p2, p0, Lmf/H;->b:Lmf/N;

    .line 7
    .line 8
    iput-object p3, p0, Lmf/H;->c:LZe/p;

    .line 9
    .line 10
    iput-object p4, p0, Lmf/H;->d:Lmf/d;

    .line 11
    .line 12
    iput p5, p0, Lmf/H;->e:I

    .line 13
    .line 14
    iput-object p6, p0, Lmf/H;->f:LSe/v;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lmf/H;->a:Lmf/K;

    .line 2
    .line 3
    iget-object v1, p0, Lmf/H;->b:Lmf/N;

    .line 4
    .line 5
    iget-object v2, p0, Lmf/H;->c:LZe/p;

    .line 6
    .line 7
    iget-object v3, p0, Lmf/H;->d:Lmf/d;

    .line 8
    .line 9
    iget v4, p0, Lmf/H;->e:I

    .line 10
    .line 11
    iget-object v5, p0, Lmf/H;->f:LSe/v;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lmf/K;->f(Lmf/K;Lmf/N;LZe/p;Lmf/d;ILSe/v;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
