.class Lse/K;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lse/X$a;


# direct methods
.method public constructor <init>(Lse/X$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lse/K;->a:Lse/X$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/K;->a:Lse/X$a;

    .line 2
    .line 3
    invoke-static {v0}, Lse/X$a;->m(Lse/X$a;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
