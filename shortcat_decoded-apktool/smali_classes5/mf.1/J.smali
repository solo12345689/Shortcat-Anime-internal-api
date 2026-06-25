.class Lmf/J;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lmf/K;

.field private final b:LSe/o;

.field private final c:Lof/N;


# direct methods
.method public constructor <init>(Lmf/K;LSe/o;Lof/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmf/J;->a:Lmf/K;

    .line 5
    .line 6
    iput-object p2, p0, Lmf/J;->b:LSe/o;

    .line 7
    .line 8
    iput-object p3, p0, Lmf/J;->c:Lof/N;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lmf/J;->a:Lmf/K;

    .line 2
    .line 3
    iget-object v1, p0, Lmf/J;->b:LSe/o;

    .line 4
    .line 5
    iget-object v2, p0, Lmf/J;->c:Lof/N;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lmf/K;->h(Lmf/K;LSe/o;Lof/N;)Ldf/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
