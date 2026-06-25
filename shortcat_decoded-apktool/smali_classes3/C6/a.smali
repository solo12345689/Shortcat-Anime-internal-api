.class public final LC6/a;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LE6/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;LE6/k;)V
    .locals 1

    .line 1
    const-string v0, "encodedImage"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, LC6/a;->a:LE6/k;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()LE6/k;
    .locals 1

    .line 1
    iget-object v0, p0, LC6/a;->a:LE6/k;

    .line 2
    .line 3
    return-object v0
.end method
