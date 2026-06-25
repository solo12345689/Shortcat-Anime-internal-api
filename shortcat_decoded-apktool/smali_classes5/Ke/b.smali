.class LKe/b;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:LKe/k;

.field private final b:Lze/h;


# direct methods
.method public constructor <init>(LKe/k;Lze/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LKe/b;->a:LKe/k;

    .line 5
    .line 6
    iput-object p2, p0, LKe/b;->b:Lze/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LKe/b;->a:LKe/k;

    .line 2
    .line 3
    iget-object v1, p0, LKe/b;->b:Lze/h;

    .line 4
    .line 5
    invoke-static {v0, v1}, LKe/c;->b(LKe/k;Lze/h;)LHe/E;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
