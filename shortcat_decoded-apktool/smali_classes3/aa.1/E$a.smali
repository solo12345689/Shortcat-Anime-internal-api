.class Laa/E$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lja/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Lja/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lja/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laa/E$a;->a:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, Laa/E$a;->b:Lja/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Lja/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Laa/E$a;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p1}, Lja/a;->b()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Laa/E$a;->b:Lja/c;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lja/c;->b(Lja/a;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Laa/s;

    .line 20
    .line 21
    const-string v1, "Attempting to publish an undeclared event %s."

    .line 22
    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Laa/s;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method
