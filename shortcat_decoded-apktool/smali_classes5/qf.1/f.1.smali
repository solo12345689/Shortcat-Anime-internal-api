.class Lqf/f;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lqf/u0;

.field private final b:Luf/r;

.field private final c:Luf/j;

.field private final d:Luf/j;


# direct methods
.method public constructor <init>(Lqf/u0;Luf/r;Luf/j;Luf/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf/f;->a:Lqf/u0;

    .line 5
    .line 6
    iput-object p2, p0, Lqf/f;->b:Luf/r;

    .line 7
    .line 8
    iput-object p3, p0, Lqf/f;->c:Luf/j;

    .line 9
    .line 10
    iput-object p4, p0, Lqf/f;->d:Luf/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lqf/f;->a:Lqf/u0;

    .line 2
    .line 3
    iget-object v1, p0, Lqf/f;->b:Luf/r;

    .line 4
    .line 5
    iget-object v2, p0, Lqf/f;->c:Luf/j;

    .line 6
    .line 7
    iget-object v3, p0, Lqf/f;->d:Luf/j;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lqf/g;->b(Lqf/u0;Luf/r;Luf/j;Luf/j;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
