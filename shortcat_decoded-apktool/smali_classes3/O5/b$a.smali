.class public final LO5/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Ly5/n;

.field private c:LO5/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic a(LO5/b$a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LO5/b$a;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic b(LO5/b$a;)Ly5/n;
    .locals 0

    .line 1
    iget-object p0, p0, LO5/b$a;->b:Ly5/n;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(LO5/b$a;)Ll6/g;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static bridge synthetic d(LO5/b$a;)LO5/h;
    .locals 0

    .line 1
    iget-object p0, p0, LO5/b$a;->c:LO5/h;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public e()LO5/b;
    .locals 2

    .line 1
    new-instance v0, LO5/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LO5/b;-><init>(LO5/b$a;LO5/c;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
