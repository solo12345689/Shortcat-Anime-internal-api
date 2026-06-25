.class public final LCb/f$b;
.super LCb/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCb/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lexpo/modules/filesystem/FileSystemPath;


# direct methods
.method public constructor <init>(Lexpo/modules/filesystem/FileSystemPath;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, LCb/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LCb/f$b;->a:Lexpo/modules/filesystem/FileSystemPath;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lexpo/modules/filesystem/FileSystemPath;
    .locals 1

    .line 1
    iget-object v0, p0, LCb/f$b;->a:Lexpo/modules/filesystem/FileSystemPath;

    .line 2
    .line 3
    return-object v0
.end method
