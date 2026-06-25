.class Lqf/T;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:Lqf/v0;

.field private final b:Ljava/util/List;

.field private final c:Lqf/r0;

.field private final d:Z


# direct methods
.method public constructor <init>(Lqf/v0;Ljava/util/List;Lqf/r0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf/T;->a:Lqf/v0;

    .line 5
    .line 6
    iput-object p2, p0, Lqf/T;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lqf/T;->c:Lqf/r0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lqf/T;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lqf/T;->a:Lqf/v0;

    .line 2
    .line 3
    iget-object v1, p0, Lqf/T;->b:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lqf/T;->c:Lqf/r0;

    .line 6
    .line 7
    iget-boolean v3, p0, Lqf/T;->d:Z

    .line 8
    .line 9
    check-cast p1, Lrf/g;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, Lqf/V;->a(Lqf/v0;Ljava/util/List;Lqf/r0;ZLrf/g;)Lqf/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
