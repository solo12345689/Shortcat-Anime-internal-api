.class final Lexpo/modules/kotlin/jni/JNIDeallocator$a;
.super Ljava/lang/Thread;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/jni/JNIDeallocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/kotlin/jni/JNIDeallocator;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/JNIDeallocator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/jni/JNIDeallocator$a;->a:Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 2
    .line 3
    const-string p1, "Expo JNI deallocator"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JNIDeallocator$a;->a:Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lexpo/modules/kotlin/jni/JNIDeallocator;->a(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/Thread;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
