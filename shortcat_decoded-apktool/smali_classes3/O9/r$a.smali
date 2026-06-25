.class LO9/r$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LO9/r$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO9/r;->e(LO9/d;)LO9/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LO9/d;


# direct methods
.method constructor <init>(LO9/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO9/r$a;->a:LO9/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LO9/r;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LO9/r$a;->b(LO9/r;Ljava/lang/CharSequence;)LO9/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(LO9/r;Ljava/lang/CharSequence;)LO9/r$b;
    .locals 1

    .line 1
    new-instance v0, LO9/r$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LO9/r$a$a;-><init>(LO9/r$a;LO9/r;Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
