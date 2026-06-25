.class Lmf/E;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lmf/K;

.field private final b:LZe/p;

.field private final c:Lmf/d;


# direct methods
.method public constructor <init>(Lmf/K;LZe/p;Lmf/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmf/E;->a:Lmf/K;

    .line 5
    .line 6
    iput-object p2, p0, Lmf/E;->b:LZe/p;

    .line 7
    .line 8
    iput-object p3, p0, Lmf/E;->c:Lmf/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lmf/E;->a:Lmf/K;

    .line 2
    .line 3
    iget-object v1, p0, Lmf/E;->b:LZe/p;

    .line 4
    .line 5
    iget-object v2, p0, Lmf/E;->c:Lmf/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lmf/K;->c(Lmf/K;LZe/p;Lmf/d;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
