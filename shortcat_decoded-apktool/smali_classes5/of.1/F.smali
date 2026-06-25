.class Lof/F;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lof/w$b;

.field private final b:Lof/w;


# direct methods
.method public constructor <init>(Lof/w$b;Lof/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lof/F;->a:Lof/w$b;

    .line 5
    .line 6
    iput-object p2, p0, Lof/F;->b:Lof/w;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lof/F;->a:Lof/w$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/F;->b:Lof/w;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lof/w$b;->p(Lof/w$b;Lof/w;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
