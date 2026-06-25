.class Lof/y;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lof/w$b;


# direct methods
.method public constructor <init>(Lof/w$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lof/y;->a:Lof/w$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/y;->a:Lof/w$b;

    .line 2
    .line 3
    invoke-static {v0}, Lof/w$b;->i(Lof/w$b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
