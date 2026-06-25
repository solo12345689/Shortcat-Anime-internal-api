.class Lmf/F;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lmf/K;

.field private final b:Z

.field private final c:LSe/o;


# direct methods
.method public constructor <init>(Lmf/K;ZLSe/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmf/F;->a:Lmf/K;

    .line 5
    .line 6
    iput-boolean p2, p0, Lmf/F;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lmf/F;->c:LSe/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lmf/F;->a:Lmf/K;

    .line 2
    .line 3
    iget-boolean v1, p0, Lmf/F;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lmf/F;->c:LSe/o;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lmf/K;->d(Lmf/K;ZLSe/o;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
