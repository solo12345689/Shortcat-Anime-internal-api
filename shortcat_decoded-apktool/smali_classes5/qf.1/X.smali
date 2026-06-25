.class Lqf/X;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lrf/g;

.field private final b:Lqf/Y;


# direct methods
.method public constructor <init>(Lrf/g;Lqf/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf/X;->a:Lrf/g;

    .line 5
    .line 6
    iput-object p2, p0, Lqf/X;->b:Lqf/Y;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lqf/X;->a:Lrf/g;

    .line 2
    .line 3
    iget-object v1, p0, Lqf/X;->b:Lqf/Y;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lqf/Y;->T0(Lrf/g;Lqf/Y;)Lqf/S;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
