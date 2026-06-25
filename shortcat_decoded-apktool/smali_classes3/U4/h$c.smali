.class final LU4/h$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU4/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:LS4/a;

.field final synthetic b:LU4/h;


# direct methods
.method constructor <init>(LU4/h;LS4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/h$c;->b:LU4/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LU4/h$c;->a:LS4/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LU4/v;)LU4/v;
    .locals 2

    .line 1
    iget-object v0, p0, LU4/h$c;->b:LU4/h;

    .line 2
    .line 3
    iget-object v1, p0, LU4/h$c;->a:LS4/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LU4/h;->D(LS4/a;LU4/v;)LU4/v;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
